package unidad2.BoletinMatch;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("CALCULADORA");
            System.out.println("========================================");
            System.out.println("Introduzca + si desea sumar");
            System.out.println("Introduzca - si desea restar");
            System.out.println("Introduzca * si desea multiplicar");
            System.out.println("Introduzca / si desea dividir");
            System.out.println("Introduzca @ para salir del menú.");
            System.out.println("========================================");
            System.out.print("Elija una opción: ");
            opcion = scanner.next();

            switch (opcion) {
                case "+":
                    System.out.print("Introduzca un número: ");
                    double numero1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    double numero2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;
                case "-":
                    System.out.print("Introduzca un número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    numero2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;
                case "*":
                    System.out.print("Introduzca un número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    numero2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;
                case "/":
                    System.out.print("Introduzca un número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    numero2 = scanner.nextDouble();
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + (numero1 / numero2));
                    } else {
                        System.out.println("Error: División entre cero no permitida.");
                    }
                    break;
                case "@":
                    System.out.println("Programa terminado. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (!opcion.equals("@"));
    }
}
