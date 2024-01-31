import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in).useLocale(Locale.US);
        int opcion;
        System.out.println("Crud de choches");
        boolean salir = false;
        do {
            menu();
            opcion = scannerNum.nextInt();
            switch (opcion){
                case 1:
                    ingresarCoche();
                    break;
                case 2:
                    break;
                case 9:
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    }
                 }
        }
}