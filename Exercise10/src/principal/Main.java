package principal;

import modelo.Arreglo;

public class Main {
    public static void main(String[] args) {

        Arreglo arr = new Arreglo(50,20);
        System.out.println("Arreglo A:");
        arr.cargarArrayA();
        arr.mostarArrayA();
        System.out.println("Arreglo A ordenado: ");
        arr.ordenarArrayA();
        arr.mostarArrayA();
        System.out.println("Arreglo B:");
        arr.rellenarArrayB();
        arr.mostarArrayB();

    }
}
