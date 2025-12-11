package EjerciciosMatch;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Lista de habitaciones: ");
        System.out.println("1. Azul");
        System.out.println("2. Roja");
        System.out.println("3. Verde");
        System.out.println("4. Rosa");
        System.out.println("5. Gris");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduce el numero de habitacion (1-5): ");
        int numero = scanner.nextInt();

        System.out.println();

        switch (numero){
            case 1:
                System.out.println("Habitacion: azul");
                System.out.println("Planta: Primera");
                System.out.println("Numero de camas: 2");
                break;
            case 2:
                System.out.println("Habitacion: Roja");
                System.out.println("Planta: Primera");
                System.out.println("Número de camas: 1");
                break;
            case 3:
                System.out.println("Habitacion: Verde");
                System.out.println("Planta: Segunda");
                System.out.println("Número de camas: 3");
                break;
            case 4:
                System.out.println("Habitacion: Rosa");
                System.out.println("Planta: Segunda");
                System.out.println("Número de camas: 2");
                break;
            case 5:
                System.out.println("Habitacion: Gris");
                System.out.println("Planta: Tercera");
                System.out.println("Número de camas: 1");
                break;
            default:
                System.out.println("Numero de habitacion no valido");
        }
    }
}
