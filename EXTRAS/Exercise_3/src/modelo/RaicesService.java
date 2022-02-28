package modelo;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class RaicesService {
    Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
    Raices raices = null;


    public void crearRaices(){
        System.out.print("Ingrese el valor de A: ");
        double a = input.nextDouble();
        System.out.print("\nIngrese el valor de B: ");
        double b = input.nextDouble();
        System.out.print("\nIngrese el valor de C: ");
        double c = input.nextDouble();

        raices = new Raices(a,b,c);
    }
    public double getDiscriminante(){
        return (Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC());
    }

    public boolean tieneRaices(){
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }

    public void obtenerRaices(){
        if(tieneRaices())
            System.out.printf("x1: %.2f\n", ((-raices.getB() - getDiscriminante()) / 2 * raices.getA()));
            System.out.printf("x2: %.2f\n", ((-raices.getB() + getDiscriminante()) / 2 * raices.getA()));
    }

    public void obtenerRaiz(){
        if (tieneRaiz())
            System.out.printf("Raiz: %.2f",((-raices.getB() - getDiscriminante()) / 2 * raices.getA()));
    }

    public void calcular(){
        if(tieneRaices()){
            if (tieneRaiz()){
                obtenerRaiz();
            }else{
                obtenerRaices();
            }
        }else{
            System.out.println("No tiene raices");
        }
    }

}
