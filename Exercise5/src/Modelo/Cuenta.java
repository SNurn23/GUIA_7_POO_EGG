package Modelo;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double ingreso) {
        this.saldo += ingreso;
    }

    public void crearCuenta(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su numero de cuenta: ");
        this.numeroCuenta = input.nextInt();
        System.out.println("Ingrese su DNI: ");
        this.dni = input.nextLong();
        this.saldo = 0;
    }

    public void retirar(double retiro){
        if(this.saldo < retiro){
            this.saldo = 0;
        }else{
            this.saldo -= retiro;
        }
    }

    public void extraccionRapida(){
        Scanner input = new Scanner(System.in);
        double retiro = 0;

        do{
            if(retiro == (this.saldo * 0.20)){
                retiro = this.saldo * 0.20;
                this.saldo -= retiro;
                System.out.printf("RETIRO: %.2f", retiro);
            }else {
                System.out.println("No puede retirar mas del 20%");
            }

        }while(retiro > (this.saldo * 0.20));
    }

    public void consultarSaldo(){
        System.out.printf("Su saldo actual es: $ %.2f\n", this.saldo);
    }


    public void consultarDatos(){
        System.out.println("Numero de cuenta = " + numeroCuenta + ", DNI = " + dni + ", Saldo Actual = $" + saldo);
    }
}
