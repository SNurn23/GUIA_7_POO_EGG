package principal;

import modelo.PuntosService;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PuntosService puntosS = new PuntosService();

        puntosS.crearPuntos();
        puntosS.mostrarPuntos();
        puntosS.calcularDistancia();

    }
}
