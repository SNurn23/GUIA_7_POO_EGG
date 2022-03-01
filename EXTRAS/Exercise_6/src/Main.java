
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      AhorcadoService ahorcado = new AhorcadoService();
      int op = 0;
      Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);

      do{
          System.out.println("---------- MENU ----------");
          System.out.println("1- Iniciar Juego");
          System.out.println("2- Salir");
          System.out.println("--------------------------");
          System.out.println("Opcion: "); op = input.nextInt();
          switch(op){
              case 1: ahorcado.juego();
                break;
              case 2:
                  System.out.println("Saliendo...Bye");
                break;
          }
          System.out.println("\n\n\n\n");
      }while(op != 2);
    }
}
