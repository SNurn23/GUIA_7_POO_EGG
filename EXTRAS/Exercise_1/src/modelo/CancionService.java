package modelo;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class CancionService {

    Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
    Cancion cancion;

    public void crearCancion(){
        System.out.println("Ingrese el titulo de la cancion: ");
        String titulo = input.next();
        System.out.println("Ingrese el autor: ");
        String autor = input.next();

        cancion = new Cancion(titulo, autor);
    }

    public void mostrarCancion() {
        System.out.println(cancion);
    }
}
