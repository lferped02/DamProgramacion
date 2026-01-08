package RepasoNavidad;

import java.util.Random;
import java.util.Scanner;

public class DungeonJavaEdition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hpHeroe = 100;
        int mpHeroe = 20;
        int hpMonstruo = 80;

        System.out.print("Introduce el nombre de tu héroe: ");
        String nombre = scanner.nextLine();

        combate(scanner, nombre, hpHeroe, mpHeroe, hpMonstruo);
    }

    public static void combate(Scanner scanner, String nombre, int hp, int mp, int hpMonstruo) {

        if (hp <= 0 || hpMonstruo <= 0) {

            if (hp <= 0 && hpMonstruo <= 0) {
                System.out.println("¡Empate! Ambos habéis caído.");
            } else if (hp <= 0) {
                System.out.println("Has sido derrotado por el monstruo.");
            } else {
                System.out.println("¡Victoria! Has derrotado al monstruo.");
            }

            return;
        }

        System.out.println("\n===== ESTADO =====");
        System.out.println(nombre + " → HP: " + hp + " | MP: " + mp);
        System.out.println("Monstruo → HP: " + hpMonstruo);
        System.out.println("==================");

        System.out.println("\nElige una acción:");
        System.out.println("1. Ataque básico (7-12 daño)");
        System.out.println("2. Ataque especial (15-25 daño, cuesta 5 MP)");
        System.out.println("3. Curar (+20 HP, cuesta 8 MP)");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        Random random = new Random();

        switch (opcion) {
            case 1:
                int danioBasico = random.nextInt(6) + 7;
                hpMonstruo -= danioBasico;
                System.out.println("Atacas con un golpe básico: -" + danioBasico + " HP");
                break;

            case 2:
                if (mp >= 5) {
                    int danioEspecial = random.nextInt(11) + 15;
                    mp -= 5;
                    hpMonstruo -= danioEspecial;
                    System.out.println("Ataque especial: -" + danioEspecial + " HP");
                } else {
                    System.out.println("No tienes suficiente energía.");
                }
                break;

            case 3:
                if (mp >= 8) {
                    mp -= 8;
                    hp += 20;
                    if (hp > 100) hp = 100;
                    System.out.println("Te curas +20 HP.");
                } else {
                    System.out.println("No tienes suficiente energía.");
                }
                break;

            default:
                System.out.println("Opción no válida. Pierdes el turno.");
        }

        if (hpMonstruo > 0) {
            int danoMonstruo = random.nextInt(11) + 5;
            hp -= danoMonstruo;
            System.out.println("El monstruo te ataca: -" + danoMonstruo + " HP");
        }

        combate(scanner, nombre, hp, mp, hpMonstruo);
    }
}
