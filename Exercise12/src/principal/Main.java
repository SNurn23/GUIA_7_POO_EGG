package principal;

import modelo.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona persona = new Persona();

        Scanner input = new Scanner (System.in);

        int op = 0;
        do {
            System.out.println("\nElija una opcion: ");
            System.out.println("1- Crear Persona");
            System.out.println("2- Calcular edad");
            System.out.println("3- Comparar edad");
            System.out.println("4- Mostrar persona");
            System.out.println("5- Salir");
            System.out.print("Opcion: ");
            op = input.nextInt();

            switch(op){
                case 1:
                    persona.crearPersona();
                    break;
                case 2:
                    System.out.printf("Edad: %d",persona.calcularEdad());
                    break;
                case 3:
                    System.out.println("Ingrese una edad");
                    if(persona.menorQue(input.nextInt())){
                        System.out.println("La edad ingresada es mayor que de la persona");
                    }else{
                        System.out.println("La edad ingresada es menor que de la persona");
                    }
                    break;
                case 4:
                    persona.mostrarPersona();
                    break;
            }
        }while (op != 5);
    }
}
