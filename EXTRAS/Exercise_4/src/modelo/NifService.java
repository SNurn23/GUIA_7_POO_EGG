package modelo;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class NifService {
    Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
    NIF nif = null;

    public void crearNIF(){
        char[] chars = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Ingrese su DNI (sin puntos)");
        long dni = input.nextLong();

        int pos = (int) (dni % 23);
        char letra = chars[pos];

        nif = new NIF(dni, letra);
    }

    public void mostrarNIF(){
        System.out.println(nif);
    }
}
