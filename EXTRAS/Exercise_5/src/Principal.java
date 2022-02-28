import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Random random = new Random();
        String mesSecreto = meses[random.nextInt((11 + 1))], mes;

        System.out.println("Adivine el mes!");
        do {

            System.out.println("Ingrese el mes: ");
            mes = input.next().toLowerCase();
            if(mes.equals(mesSecreto)){
                System.out.println("Has Acertado!!!");
            }else{
                System.out.println("Vuelva a Intentarlo");
            }
        }while(!mes.equals(mesSecreto));
    }
}
