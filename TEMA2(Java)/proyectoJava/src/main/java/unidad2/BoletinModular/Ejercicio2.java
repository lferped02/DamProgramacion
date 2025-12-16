package unidad2.BoletinModular;

import java.util.Scanner;

public class Ejercicio2 {
    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio2 multiplicacion = new Ejercicio2();
        System.out.print("Dame el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Dame el segundo número: ");
        int numero2 = scanner.nextInt();
        int resultado = multiplicacion.multiplicar(numero1, numero2);
        System.out.println("El resultado es: " + resultado);

    }
}
