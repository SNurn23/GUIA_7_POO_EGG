package Principal;

import Modelo.Operation;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Operation operation = new Operation();

        Scanner input = new Scanner(System.in);
        operation.createOperation();
        int op = 0;
        do {
            System.out.println("\nChoose an option: 1)Add, 2)Subtract, 3)Multiply, 4)Divide, 5)Exit");
            op = input.nextInt();
            switch (op){
                case 1:
                    System.out.printf("The result of the add between %d and %d is: %d", operation.getNumber1(), operation.getNumber2(), operation.addNumbers());
                    break;
                case 2:
                    System.out.printf("The result of the subtraction between %d and %d is: %d", operation.getNumber1(), operation.getNumber2(), operation.subtractNumbers());
                    break;
                case 3:
                    if (operation.multiplyNumbers() == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.printf("The result of the multiplication between %d and %d is: %d", operation.getNumber1(), operation.getNumber2(), operation.multiplyNumbers());
                    }
                    break;
                case 4:
                    if (operation.divideNumbers() == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.printf("The result of the division between %d and %d is: %d", operation.getNumber1(), operation.getNumber2(), operation.divideNumbers());
                    }
                    break;
            }
        }while(op != 5);
    }
}
