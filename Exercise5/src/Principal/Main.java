package Principal;

import Modelo.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op=0;

        Cuenta cuenta = new Cuenta();

        do{
            System.out.println("\nSeleccione una opcion: ");
            System.out.println("1- Crear cuenta");
            System.out.println("2- Ingresar dinero");
            System.out.println("3- Retirar");
            System.out.println("4- Extraccion Rapida");
            System.out.println("5- Consultar Saldo");
            System.out.println("6- Consultar Datos");
            System.out.println("7- Salir");
            System.out.print("Opcion: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    cuenta.crearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero a ingresar: ");
                    cuenta.ingresar(input.nextDouble());
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero a retirar: ");
                    cuenta.retirar(input.nextDouble());
                    break;
                case 4:
                    cuenta.extraccionRapida();
                    break;
                case 5:
                    cuenta.consultarSaldo();
                    break;
                case 6:
                    cuenta.consultarDatos();
                    break;
            }
        }while(op != 7);
    }
}
