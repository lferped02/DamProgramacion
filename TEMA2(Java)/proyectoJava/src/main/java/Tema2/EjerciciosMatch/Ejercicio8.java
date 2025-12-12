package unidad2.BoletinMatch;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        double numero1, numero2, resultado;

        while (opcion != 0) {

            System.out.println("\n--- Calculadora Simple ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                System.out.print("Introduce el primer número: ");
                numero1 = scanner.nextDouble();

                System.out.print("Introduce el segundo número: ");
                numero2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = numero1 * numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: División entre cero no permitida.");
                        }
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
        }
        System.out.println("Programa terminado. ¡Hasta pronto!");
    }
}

