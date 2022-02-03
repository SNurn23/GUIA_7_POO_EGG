package modelo;

import java.util.Locale;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {

    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {
        int cVocales = 0;
        for (int i = 0; i < longitud; i++) {
            switch (frase.toUpperCase().substring(i, i + 1)) {
                case "A":
                case "E":
                case "I":
                case "O":

                case "U":
                    cVocales++;
                break;
            }
        }
        System.out.println("Cantidad de vocales: " + cVocales);

    }

    public void invertirFrase() {
        String cad = "";
        for (int i = longitud - 1; i >= 0; i--) {
          cad = cad.concat(frase.substring(i,i+1));  //Otra forma de invertir es usando el metodo reverse o append
        }
        System.out.println("Frase invertida: " + cad);
        System.out.println("Frase original: "+ frase);
    }

    public void vecesRepetido(String letra) {
        int cRepetido = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                cRepetido++;
            }
        }
        System.out.println("La letra ["+ letra + "] se repite: " + cRepetido + " veces");
    }


    public void compararLongitud(String frase) {
        if (longitud > frase.length()) {
            System.out.println("La frase "+frase+" es menor que la frase "+this.frase);
        } else if (longitud < frase.length()) {
            System.out.println("La frase "+frase+" es mayor que la frase "+this.frase);
        } else {
            System.out.println("Ambas frases son iguales");
        }
    }

    public void unirFrase(String frase) {
        System.out.println("Las frases unidas: " + this.frase.concat(frase));
    }

    public void remplazarLetra(char c)  {
        this.frase = this.frase.replace('a',c);
        System.out.println("La frase con el caracter remplazado es: " + this.frase);
    }

    public boolean contieneLetra(String letra) {
        return frase.contains(letra);
    }

}


