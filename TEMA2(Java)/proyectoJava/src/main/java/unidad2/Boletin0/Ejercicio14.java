package unidad2.Boletin0;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero1 = random.nextInt(5);
        int numero2 = random.nextInt(5);
        int sumaCorrecta = numero1 + numero2;
        int respuesta;

        System.out.println("Calcula la suma de los siguientes números:");
        do {
            System.out.println(numero1 + " + " + numero2 + " = ?");
            System.out.print("Introduce tu respuesta: ");
            respuesta = scanner.nextInt();

            if (respuesta != sumaCorrecta) {
                System.out.println("Incorrecto, inténtalo de nuevo.");
            }
        } while (respuesta != sumaCorrecta);
        System.out.println("¡Correcto! La suma es " + sumaCorrecta);
    }
}
