package RetosFaciles.Padel.Controlador;

import java.util.Scanner;

public class Padel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[4];
        int suma = 0;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = scanner.nextInt();
        }
    }
}

//https://programame.com/documents/ProblemsSets/2025/ProgramaMe-2025-Zaragoza.pdf