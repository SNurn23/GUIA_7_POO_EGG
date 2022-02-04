package principal;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Date fecha_actual = new Date();

        int diferencia = 0;

        System.out.println("Ingrese el dia:");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = input.nextInt();
        System.out.println("Ingrese el año:");
        int anio = input.nextInt();

        Date fecha = new Date(anio-1900,mes-1,dia);

       // System.out.println("Fecha Actual: " + fecha_actual); //SALIDA -> Fecha Actual: Tue Feb 01 18:47:45 ART 2022
        System.out.printf("Fecha Actual: %d/%d/%d \n",fecha_actual.getDate(),fecha_actual.getMonth()+1,fecha_actual.getYear()+1900);
        System.out.printf("Fecha Ingresada: %d/%d/%d \n",fecha.getDate(),fecha.getMonth()+1,fecha.getYear()+1900);


        diferencia = Math.abs((fecha_actual.getYear())-fecha.getYear());

        //Si el mes actual es menor que el que me pasan le resto 1
        //Si el mes es igual y el dia que me pasan es mayor al actual le resto 1
        if(diferencia != 0){
            if(fecha_actual.getMonth() <= fecha.getMonth()){
                if(fecha.getDate() > fecha_actual.getDate()){
                    diferencia--;
                }
            }else{
                diferencia--;
            }
        }
        //Usar la clase LocalDate
        System.out.printf("La diferencia de años entre la fechas es: %d",diferencia);
    }
}

