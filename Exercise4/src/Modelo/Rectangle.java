package Modelo;

import java.util.Scanner;

public class Rectangle {
    private double base;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surface(){
        return this.base * this.height;
    }

    public double perimeter(){
        return (this.base + this.height) * 2;
    }

    public void createRectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of rectangle: ");
        this.base = input.nextDouble();
        System.out.println("Enter the height of rectangle: ");
        this.height = input.nextDouble();
    }

    public void drawRectangle(){
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.base ; j++) {
                if (i > 0 && j > 0 && i < this.height - 1 && j < this.base - 1) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
