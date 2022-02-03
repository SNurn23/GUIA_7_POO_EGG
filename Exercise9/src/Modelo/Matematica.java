package Modelo;

import java.math.MathContext;

public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

//SIN METODOS
 /*   public double devolverMayor(){
        if(this.num1 >= this.num2){
            return this.num1;
        }
        return this.num2;
    }

    public void calcularPotencia(){
        if(this.num1 >= this.num2){
            System.out.println("La potencia de "+this.num1+"^"+this.num2+" es: "+Math.pow(this.num1,this.num2));
        }else{
            System.out.println("La potencia de "+this.num2+"^"+this.num1+" es: "+Math.pow(this.num2,this.num1));
        }
    }

    public void calcularRaiz(){
        if(this.num1 >= this.num2){
            System.out.printf("La raiz de "+this.num1+"√"+this.num2+" es: "+Math.pow(this.num1,(1.0/this.num2)));
        }else{
            System.out.printf("La raiz de "+this.num2+"√"+this.num1+" es: "+Math.pow(this.num2,(1.0/this.num1)));
        }
    }*/

//CON METODOS
    public double devolverMayor(){
        return Math.max(num1, num2);
    }

    public void calcularPotencia(){
        double min = Math.min(num1, num2);
        double max = devolverMayor();

        System.out.printf("La raiz de %.2f^%.2f es: %.2f",max,min,Math.pow(max,min));
    }

    public void calcularRaiz(){
        double min = Math.min(num1, num2);
        double max = devolverMayor();
        System.out.printf("La raiz de %.2f√%.2f es: %.2f",max,min,Math.pow(max, 1.0/min));
    }
}
