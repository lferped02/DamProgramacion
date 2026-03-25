package RetosFaciles.Padel.Controlador;

import java.util.Scanner;

public class CulpaPadel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int companero = scanner.nextInt();
            int pista = scanner.nextInt();
            int pala = scanner.nextInt();
            int pelota = scanner.nextInt();

            int tuCulpa = 100 - (companero + pista + pala + pelota);
            System.out.println(tuCulpa);
        }

        scanner.close();
    }
}
//https://programame.com/documents/ProblemsSets/2025/ProgramaMe-2025-Zaragoza.pdf