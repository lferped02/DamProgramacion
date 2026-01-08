package unidad2.RepasoNavidad;

import java.util.Random;
import java.util.Scanner;

public class DungeonJavaEdition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int HPHeroe = 100;
        int MP = 20;
        int HPMonstruo = 80;
        System.out.println("Introduce el nombre de tu héroe: ");
        String nombreHeroe = scanner.nextLine();

        System.out.println("1. Ataque básico");
        System.out.println("2. Ataque especial");
        System.out.println("3. Curar");
        System.out.println("Introduce un número(1, 2, 3): ");
        int opcion = scanner.nextInt();
        if(opcion==1){
            Random basico = new Random();
            int ataqueBasico = basico.nextInt(7,12);
            System.out.println("No consume energía");
        } else if (opcion==2) {
            Random especial = new Random();
            int puntoEnergia = 5;
            int ataqueEspecial = especial.nextInt(15,25);
        }
    }
}
