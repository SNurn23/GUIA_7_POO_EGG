package modelo;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private Date fecha_nacimiento;

    public Persona(String nombre, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void crearPersona(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        this.nombre = input.next();
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Dia: "); int dia = input.nextInt();
        System.out.print("\nMes: "); int mes = input.nextInt();
        System.out.print("\nAño: "); int anio = input.nextInt();
        this.fecha_nacimiento = new Date(anio-1900,mes-1,dia);
    }

    public int calcularEdad() {
        Date fecha_actual = new Date();
        int edad;

       edad = Math.abs((fecha_actual.getYear())-fecha_nacimiento.getYear());

       if(edad != 0){
            if((fecha_actual.getMonth()) <= fecha_nacimiento.getMonth()){
                    if(fecha_nacimiento.getDate() > fecha_actual.getDate()){
                        edad--;
                    }
            }else{
                edad--;
            }
       }
       return edad;
    }

    public boolean menorQue(int edad2){
        return edad2 > calcularEdad();
    }

    public void mostrarPersona(){
        System.out.printf("\nNombre: %s\n",this.nombre);
        System.out.printf("Fecha de nacimiento: %d/%d/%d\n",this.fecha_nacimiento.getDate(),this.fecha_nacimiento.getMonth()+1,this.fecha_nacimiento.getYear()+1900);
        System.out.printf("Edad: %d\n",calcularEdad());
    }

}
