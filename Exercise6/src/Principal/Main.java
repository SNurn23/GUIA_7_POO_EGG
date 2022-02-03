package Principal;

import Modelo.Nespresso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int op = 0;
        Nespresso cafetera = new Nespresso(700,0);
        do {
            System.out.println("\nElija una opcion: ");
            System.out.println("1- LLenar cafetera");
            System.out.println("2- Servir Taza");
            System.out.println("3- Vaciar Cafetera");
            System.out.println("4- Agregar Cafe");
            System.out.println("5- Salir");
            System.out.print("Opcion: ");
            op = input.nextInt();

            switch(op){
                case 1: cafetera.llenarCafetera();
                break;
                case 2: System.out.println("Ingrese el tamaño de la taza:");
                        cafetera.servirTaza(input.nextInt());
                break;
                case 3: cafetera.vaciarCafetera();
                break;
                case 4: System.out.println("Ingrese la cantidad de cafe a cargar:");
                        cafetera.agregarCafe(input.nextInt());
                break;
            }
        }while (op != 5);
    }
}
