package Modelo;

public class Nespresso {
    private int capacidadMax;
    private int capacidadActual;

    public Nespresso() {
    }

    public Nespresso(int capacidadMax, int capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public int  getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int  capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int  getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int  capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMax;
        System.out.println("CAFETERA LLENA");
    }

    public void servirTaza(int taza){
        if(this.capacidadActual >= taza){
            this.capacidadActual -= taza;
            System.out.println("Se lleno la taza completamente");
        }else{
            System.out.printf("Se lleno la taza con %d ml",this.capacidadActual);
            this.capacidadActual = 0;
        }
    }

    public void vaciarCafetera(){
        this.capacidadActual = 0;
        System.out.println("CAFETERA VACIA");
    }

    public void agregarCafe(int cafe){
        if((cafe+this.capacidadActual) > this.getCapacidadMax()){
            System.out.println("ERROR: Cantidad de cafe no permitida");
        }else{
            this.capacidadActual += cafe;
            System.out.printf("CAPACIDAD ACTUAL: %d", this.capacidadActual);
        }
    }

}
