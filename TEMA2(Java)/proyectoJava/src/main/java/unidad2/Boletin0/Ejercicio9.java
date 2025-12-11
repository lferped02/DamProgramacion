package EjerciciosMatch;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("========================================");
            System.out.println("\t\tCALCULADORA");
            System.out.println("========================================");
            System.out.println("\t Introduzca + si desea sumar");
            System.out.println("\t Introduzca - si desea restar");
            System.out.println("\t Introduzca * si desea multiplicar");
            System.out.println("\t Introduzca / si desea dividir");
            System.out.println("\t Introduzca @ para salir del menú.");
            System.out.println("========================================");
            System.out.print("Elija una opción: ");
            opcion = scanner.next();

            switch (opcion) {
                case "+":
                    System.out.print("Introduzca un número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case "-":
                    System.out.print("Introduzca un número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case "*":
                    System.out.print("Introduzca un número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case "/":
                    System.out.print("Introduzca un número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduzca otro número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
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
        }while (!opcion.equals("@"));
    }
}
