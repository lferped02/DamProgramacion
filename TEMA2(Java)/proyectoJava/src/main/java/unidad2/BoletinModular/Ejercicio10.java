package unidad2.BoletinModular;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    public void adivinaNumero(int numeroAdivinar) {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario = 0;
        int intento = 0;

        while (numeroUsuario != numeroAdivinar) {
            System.out.print("Introduce un número: ");
            numeroUsuario = scanner.nextInt();
            intento++;
        }

        System.out.println("Has acertado.");
        System.out.println("Número adivinado: " + numeroUsuario);
        System.out.println("Número de intentos: " + intento);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        Ejercicio10 referencia = new Ejercicio10();
        referencia.adivinaNumero(numeroAleatorio);
    }
}
