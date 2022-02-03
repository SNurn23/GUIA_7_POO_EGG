package Principal;

import Modelo.Rectangle;

public class Principal {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println("\t**************RECTANGLE***************");
        rectangle.createRectangle();
        rectangle.drawRectangle();
        System.out.printf("\nBase: %.2f, Height: %.2f, Surface: %.2f, Perimeter: %.2f",rectangle.getBase(),rectangle.getHeight(),rectangle.surface(),rectangle.perimeter());
    }
}
