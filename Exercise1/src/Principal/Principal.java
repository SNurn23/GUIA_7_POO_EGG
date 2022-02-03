package Principal;

import Modelo.Libro;

public class Principal {

    public static void main(String[] args) {
        Libro book = new Libro();
        book.loadBooks();
        book.showInformation();
    }
}
