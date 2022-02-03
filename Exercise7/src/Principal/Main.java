package Principal;

import Modelo.Persona;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        double cPidel = 0, cSobrep = 0, cPdebajo = 0, cMay = 0, cMen = 0;

        for (int i = 0; i < personas.length; i++) {
            System.out.printf("PERSONA [%d]\n",(i+1));
            personas[i] = new Persona();
            personas[i].crearPersona();

            switch (personas[i].calcularIMC()){
                case -1:
                    cPdebajo++;
                break;
                case 0:
                    cPidel++;
                break;
                case 1:
                    cSobrep++;
                break;
            }

            if (personas[i].esMayorDeEdad()) {
                cMay++;
            }else{
                cMen++;
            }
        }

        System.out.println("Porcentaje de personas con peso ideal: " + ((cPidel/personas.length)*100) + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + ((cSobrep/personas.length)*100) + "%");
        System.out.println("Porcentaje de personas por debajo del peso ideal: " + ((cPdebajo/personas.length)*100) + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + ((cMay/personas.length)*100) + "%");
        System.out.println("Porcentaje de personas menores de edad: " + ((cMen/personas.length)*100) + "%");
    }
}
