package Modelo;

import java.util.Scanner;

public class Operation {
    private int number1;
    private int number2;

    public Operation() {
    }

    public Operation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void createOperation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        this.number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        this.number2 = input.nextInt();
    }

    public int addNumbers(){
        return this.number1 + this.number2;
    }

    public int subtractNumbers() {
        return this.number1 - this.number2;
    }

    public int multiplyNumbers() {
        if (this.number1 == 0 || this.number2 == 0){
            return 0;
        }
        return this.number1 * this.number2;
    }

    public int divideNumbers() {
        if (this.number2 == 0){
            return 0;
        }
        return this.number1 / this.number2;
    }
}
