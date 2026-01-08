package unidad2.BoletinModular;

import java.util.Scanner;

public class Ejercicio7 {
    public void imprimeMultiplos(int numero) {
        for (int i=1; i<11; i++) {
            int multiplo = i*numero;
            System.out.println(multiplo);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int numero = scanner.nextInt();
        Ejercicio7 referencia = new Ejercicio7();
        referencia.imprimeMultiplos(3);
    }
}

