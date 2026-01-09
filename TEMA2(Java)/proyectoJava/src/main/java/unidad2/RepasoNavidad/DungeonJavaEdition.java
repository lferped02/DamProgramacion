package unidad2.RepasoNavidad;

import java.util.Random;
import java.util.Scanner;

public class DungeonJavaEdition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hpHeroe = 100;
        int mp = 20;
        int hpMonstruo = 80;
        System.out.print("Introduce el nombre de tu héroe: ");
        String nombreHeroe = scanner.nextLine();

        while (hpHeroe > 0 && hpMonstruo > 0) {
            System.out.println("\n--- ESTADO DEL COMBATE ---");
            System.out.println(nombreHeroe + " HP: " + hpHeroe + " MP: " + mp);
            System.out.println("Monstruo HP: " + hpMonstruo);
            System.out.println("--------------------------");
            System.out.println("1. Ataque básico (7-12 daño)");
            System.out.println("2. Ataque especial (15-25 daño, cuesta 5 MP)");
            System.out.println("3. Curar (+20 HP, cuesta 8 MP)");
            System.out.print("Selecciona una acción: ");
            int opcion = scanner.nextInt();
            int danioRealizado = 0;

            if (opcion == 1) {
                danioRealizado = random.nextInt(7, 13);
                hpMonstruo -= danioRealizado;
                System.out.println("¡Atacaste! Hiciste " + danioRealizado + " de daño.");
            }
            else if (opcion == 2) {
                if (mp >= 5) {
                    danioRealizado = random.nextInt(15, 26);
                    hpMonstruo -= danioRealizado;
                    mp = mp - 5;
                    System.out.println("¡Ataque Especial! Hiciste " + danioRealizado + " de daño.");
                } else {
                    System.out.println("¡No tienes suficiente MP! Pierdes el turno intentándolo.");
                }
            }
            else if (opcion == 3) {
                if (mp >= 8) {
                    hpHeroe += 20;
                    mp = mp - 8;
                    System.out.println("Te has curado. +20 HP. Ahora tienes " + hpHeroe + " HP.");
                } else {
                    System.out.println("No tienes MP para curarte.");
                }
            } else {
                System.out.println("Acción no válida, te quedas paralizado por el miedo.");
            }

            if (hpMonstruo > 0) {
                int danioMonstruo = random.nextInt(5, 16);
                hpHeroe -= danioMonstruo;
                System.out.println("El monstruo contraataca y te quita " + danioMonstruo + " de vida.");
            } else {
                System.out.println("\n¡HAS DERROTADO AL MONSTRUO!");
            }
            if (hpHeroe <= 0) {
                System.out.println("\nHas caído en combate... Fin de la partida.");
            }
        }
    }
}