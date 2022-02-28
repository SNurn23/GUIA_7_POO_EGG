package principal;

import modelo.RaicesService;

public class Main {
    public static void main(String[] args) {
        RaicesService raicesS = new RaicesService();
        raicesS.crearRaices();
        raicesS.calcular();
    }
}
