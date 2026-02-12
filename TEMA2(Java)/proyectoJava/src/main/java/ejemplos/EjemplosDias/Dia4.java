package ejemplos.EjemplosDias;

import java.util.Random;
import java.util.Scanner;

public class Dia4 {
    public static void main(String[] args) {
        boolean encontrado = false;
        Random random = new Random();
        int numeroAlzar = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int apuesta;
        while (!encontrado){
            System.out.println("Adivina el numero: ");
            apuesta = scanner.nextInt();
            if(apuesta == numeroAlzar){
                encontrado = true;
            }
        }
    }
}
