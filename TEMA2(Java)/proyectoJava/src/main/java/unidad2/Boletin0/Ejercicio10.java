package unidad2.Boletin0;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero2 != 0) {
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("No se puede dividir entre 0");
        }
    }
}
