package unidad2.Boletin0;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El mayor numero es: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El mayor numero es: " + numero2);
        } else {
            System.out.println("El mayor numero es: " + numero3);
        }
    }
}