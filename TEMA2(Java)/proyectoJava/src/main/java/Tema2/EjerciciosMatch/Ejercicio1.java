package unidad2.BoletinMatch;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero;
        numero = scanner.nextInt();
        switch (numero){
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            default:
                System.out.println("OTRAS");
        }
    }
}
