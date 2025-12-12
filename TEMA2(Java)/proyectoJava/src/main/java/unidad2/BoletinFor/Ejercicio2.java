package unidad2.BoletinFor;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();
        String cadena = "";

        for (int i = 1; i <= numero; i++) {
            cadena += "*";
            System.out.println(cadena);
        }
    }
}
