package Modelo;

import java.util.Scanner;

public class Circumference {
    private double radius;

    public Circumference(double radius) {
        this.radius = radius;
    }

    public Circumference() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void createCircumference() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circumference: ");
        this.setRadius(input.nextDouble());
    }

    public double area() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
