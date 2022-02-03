package principal;

import modelo.Cadena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int op = 0;

        System.out.println("Ingrese una frase:");
        String f = input.next();
        Cadena frase = new Cadena(f,f.length());

        do{
            System.out.println("\nElija una opcion: ");
            System.out.println("1- Mostrar Vocales");
            System.out.println("2- Invertir Frase");
            System.out.println("3- Contar veces repetido");
            System.out.println("4- Comparar longitud");
            System.out.println("5- Unir frases");
            System.out.println("6- Remplazar");
            System.out.println("7- Contiene letra");
            System.out.println("8- Salir");
            System.out.print("Opcion: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    frase.mostrarVocales();
                    break;
                case 2:
                    frase.invertirFrase();
                    break;
                case 3:
                    System.out.println("Ingrese una letra a buscar:");
                    frase.vecesRepetido(input.next());
                    break;
                case 4:
                    System.out.println("Ingrese una frase para comparar:");
                    frase.compararLongitud(input.next());
                    break;
                case 5:
                    System.out.println("Ingrese una frase a unir:");
                    frase.unirFrase(input.next());
                    break;
                case 6:
                    System.out.println("Ingrese una letra :");
                    frase.remplazarLetra(input.next().charAt(0));
                    break;
                case 7:
                    System.out.println("Ingrese una letra a buscar:");
                    if(frase.contieneLetra(input.next())){
                        System.out.println("Contiene la letra");
                    }else {
                       System.out.println("No contiene la letra");
                    }
                break;
            }
        }while(op != 8);
    }
}
