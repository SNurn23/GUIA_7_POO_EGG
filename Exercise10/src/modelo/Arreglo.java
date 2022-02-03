package modelo;

import java.util.Arrays;

public class Arreglo {
    private double[] aA;
    private double[] aB;

    public Arreglo(int tamA, int tamB) {
        this.aA = new double[tamA];
        this.aB = new double[tamB];
    }

    public void cargarArrayA(){
        for (int i = 0; i < this.aA.length; i++){
            this.aA[i] = Math.round((Math.random()*10+1)*100.0)/100.0;
        }
    }
    public void mostarArrayA(){
        System.out.println(Arrays.toString(this.aA));
    }

    public void ordenarArrayA(){
        Arrays.sort(this.aA);
    }

    public void rellenarArrayB(){
       aB = Arrays.copyOfRange(aA,0,20);
       Arrays.fill(aB,10,20,0.5);
    }

    public void mostarArrayB(){
        System.out.println(Arrays.toString(this.aB));
    }

}
