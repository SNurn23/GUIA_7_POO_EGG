package modelo;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class PuntosService {

    Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
    Puntos puntos = null;

    public void crearPuntos(){

        System.out.print("Ingrese el valor de x1: ");
        double x1 = input.nextDouble();
        System.out.print("\nIngrese el valor de y1: ");
        double y1 = input.nextDouble();
        System.out.print("\nIngrese el valor de x2: ");
        double x2 = input.nextDouble();
        System.out.print("\nIngrese el valor de y2: ");
        double y2 = input.nextDouble();

        puntos = new Puntos(x1,y1,x2,y2);
    }

    public void mostrarPuntos(){
        System.out.println(puntos);
    }

    public void calcularDistancia(){
        double distancia = 0;

        distancia = Math.pow((puntos.getX2()-puntos.getX1()),2) - Math.pow((puntos.getY2()-puntos.getY1()),2);
        if(distancia >= 0)
            System.out.printf("\nLa distancia entre los puntos es: %.2f\n",Math.sqrt(distancia));
        else
            System.out.println("No se puede calcular");
    }
}
