import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;


public class AhorcadoService {

    Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
    Ahorcado ahorcado = null;
    String[] letras = null, aux = null;

    public void crearJuego(){
        System.out.println("Ingrese la palabra para el juego: ");
        String palabra = input.next().toUpperCase();
        ahorcado = new Ahorcado(guardarPalabra(palabra),0,6); //jugadas maximas ya fijas
    }

    public String[] guardarPalabra(String palabra){
        letras = new String[palabra.length()];
        aux = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.substring(i,i+1);
            aux[i] = "_";
        }
        return letras;
    }

    public int mostrarLongitud(){
        return ahorcado.getPalabra().length;
    }

    public boolean verficarLetra(String letra){
        for (String l : letras){
            if(l.equalsIgnoreCase(letra)){
                return true;
            }
        }
        return false;
    }

    public boolean encontradas(String letra){

        int longi = mostrarLongitud(), cont = 0;
        boolean b = verficarLetra(letra);

        for (int i = 0; i < longi ; i++){
            if(letras[i].equalsIgnoreCase(letra)){
                cont ++;
                if(aux[i].equals("_")){
                    aux[i] = letras[i];
                }
            }
        }

        int intentos = ahorcado.getContJugadasMax();

        if(b){
            System.out.printf("La letra [%s] se encuentra en la palabra\n",letra);
        }else{
            intentos--;
            ahorcado.setContJugadasMax(intentos);
            System.out.printf("La letra [%s] no se encuentra en la palabra\n",letra);
        }
        int encontradas = ahorcado.getCantEncontradas()+cont;

        System.out.println("---------------------------------");
        System.out.printf("Cantidad de letras encontradas: %d\n", encontradas);
        System.out.printf("Cantidad de letras faltantes: %d\n",(longi - encontradas));
        System.out.println("---------------------------------");
        ahorcado.setCantEncontradas(encontradas);
        return b;
    }

    public void intentos(){
        System.out.println("-----------------------------------");
        System.out.printf("Cantidad de intentos disponibles: %d\n", ahorcado.getContJugadasMax());
        System.out.println("-----------------------------------");
    }

    public void mostrarTablero(){
        System.out.println("**********************");
        for (String t : aux) {
            System.out.print(t);
        }

        System.out.println("\n**********************");
    }

    public void crearMuneco(){
        switch (ahorcado.getContJugadasMax()){
            case 0:
                System.out.println("\t\t+---+\n" +
                        "        |   |\n" +
                        "        O   |\n" +
                        "       /|\\  |\n" +
                        "       / \\  |\n" +
                        "            |\n" +
                        "    =========");
            break;

            case 1:
                System.out.println("\t\t+---+\n" +
                        "        |   |\n" +
                        "        O   |\n" +
                        "       /|\\  |\n" +
                        "       /    |\n" +
                        "            |\n" +
                        "    =========");
            break;

            case 2:
                System.out.println("\t\t+---+\n" +
                        "        |   |\n" +
                        "        O   |\n" +
                        "       /|\\  |\n" +
                        "            |\n" +
                        "            |\n" +
                        "    =========");
            break;

            case 3:
                System.out.println("\t\t+---+\n" +
                        "        |   |\n" +
                        "        O   |\n" +
                        "       /|   |\n" +
                        "            |\n" +
                        "            |\n" +
                        "    =========");
            break;

            case 4:
                System.out.println("\t\t+---+\n" +
                        "        |   |\n" +
                        "        O   |\n" +
                        "        |   |\n" +
                        "            |\n" +
                        "            |\n" +
                        "    =========");
            break;

            case 5:
                System.out.println("\t\t+---+\n" +
                        "        |   |\n" +
                        "        O   |\n" +
                        "            |\n" +
                        "            |\n" +
                        "            |\n" +
                        "    =========");
            break;

            case 6:
                System.out.println("\t\t+---+\n" +
                        "        |   |\n" +
                        "            |\n" +
                        "            |\n" +
                        "            |\n" +
                        "            |\n" +
                        "    =========");
            break;
        }
    }

    public void juego(){
        System.out.println("BIENVENIDOS AL JUEGO DEL AHORCADO");
        crearJuego();
        do{
            System.out.println("\n\n\n");
            crearMuneco();
            mostrarTablero();
            System.out.println("Ingrese una letra: ");
            String letra = input.next();
            if(!encontradas(letra)){
                intentos();
            }
        }while((ahorcado.getContJugadasMax() != 0) && (ahorcado.getCantEncontradas() != letras.length));

        if(ahorcado.getCantEncontradas() == letras.length){
            mostrarTablero();
            System.out.println("Has Acertado!!");
        }else{
            System.out.println("Has Perdido =(");
        }
    }


}
