package principal;

import modelo.NifService;

public class Main {
    public static void main(String[] args) {
        NifService nifS = new NifService();

        nifS.crearNIF();
        nifS.mostrarNIF();
    }
}
