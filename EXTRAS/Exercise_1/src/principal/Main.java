package principal;

import modelo.Cancion;
import modelo.CancionService;

public class Main {
    public static void main(String[] args) {
        CancionService cancionService = new CancionService();

        cancionService.crearCancion();
        cancionService.mostrarCancion();
    }
}
