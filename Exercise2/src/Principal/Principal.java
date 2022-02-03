package Principal;

import Modelo.Circumference;


public class Principal {

    public static void main(String[] args) {

        Circumference circumference = new Circumference();

        circumference.createCircumference();

        System.out.printf("The circumference has a radius of %.2f, its area is %.2f and its perimeter is %.2f",circumference.getRadius(),circumference.area(),circumference.perimeter());
    }
}
