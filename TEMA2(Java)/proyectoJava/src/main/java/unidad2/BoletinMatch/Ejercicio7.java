package unidad2.BoletinMatch;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero != 0) {

            System.out.println("\nListado de habitaciones:");
            System.out.println("1. Azul");
            System.out.println("2. Roja");
            System.out.println("3. Verde");
            System.out.println("4. Rosa");
            System.out.println("5. Gris");
            System.out.println("0. Salir");

            System.out.println("\nIntroduce el número de habitación (0 para salir): ");
            numero = scanner.nextInt();
            System.out.println();

            switch (numero) {
                case 1:
                    System.out.println("Habitación Azul");
                    System.out.println("Planta: Primera");
                    System.out.println("Número de camas: 2");
                    break;
                case 2:
                    System.out.println("Habitación Roja");
                    System.out.println("Planta: Primera");
                    System.out.println("Número de camas: 1");
                    break;
                case 3:
                    System.out.println("Habitación Verde");
                    System.out.println("Planta: Segunda");
                    System.out.println("Número de camas: 3");
                    break;
                case 4:
                    System.out.println("Habitación Rosa");
                    System.out.println("Planta: Segunda");
                    System.out.println("Número de camas: 2");
                    break;
                case 5:
                    System.out.println("Habitación Gris");
                    System.out.println("Planta: Tercera");
                    System.out.println("Número de camas: 1");
                    break;
                case 0:
                    System.out.println("Programa terminado. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Número de habitación no válido.");
            }
        }
    }
}
