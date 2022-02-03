package Principal;

import Modelo.Matematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        matematica.setNum1(Math.round((Math.random()*10+1)*100.0)/100.0);
        matematica.setNum2(Math.round((Math.random()*10+1)*100.0)/100.0);

        Scanner input = new Scanner (System.in);

        int op = 0;
        do {
            System.out.println("\nElija una opcion: ");
            System.out.println("1- Devolver Mayor");
            System.out.println("2- Calcular Potencia");
            System.out.println("3- Calcular Raiz");
            System.out.println("4- Salir");
            System.out.print("Opcion: ");
            op = input.nextInt();

            switch(op){
                case 1:
                    System.out.printf("EL numero mayor es: %.2f",matematica.devolverMayor());
                    break;
                case 2: matematica.calcularPotencia();
                    break;
                case 3: matematica.calcularRaiz();
                    break;
            }
        }while (op != 4);
    }
}
