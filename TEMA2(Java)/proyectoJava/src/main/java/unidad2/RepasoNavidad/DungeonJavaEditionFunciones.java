package RepasoNavidad;

import java.util.Random;
import java.util.Scanner;

public class DungeonJavaEditionFunciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hpHeroe = 100;
        int mpHeroe = 20;
        int hpMonstruo = 80;

        System.out.print("Introduce el nombre de tu héroe: ");
        String nombre = scanner.nextLine();

        while (hpHeroe > 0 && hpMonstruo > 0) {
            mostrarEstado(nombre, hpHeroe, mpHeroe, hpMonstruo);
            int opcion = leerOpcion(scanner);

            if (opcion == 1) {
                int danioBase = generarDanyo(7, 12);
                int danioFinal = calcularCritico(danioBase);
                hpMonstruo = hpMonstruo - danioFinal;
            }
            else if (opcion == 2) {
                if (tieneEnergia(mpHeroe, 5)) {
                    int danyoBase = generarDanyo(15, 25);
                    int danyoFinal = calcularCritico(danyoBase);
                    hpMonstruo = hpMonstruo - danyoFinal;
                    mpHeroe = mpHeroe - 5;
                } else {
                    System.out.println("¡No tienes suficiente MP!");
                }
            }
            else if (opcion == 3) {
                if (tieneEnergia(mpHeroe, 8)) {
                    hpHeroe = hpHeroe + 20;
                    mpHeroe = mpHeroe - 8;
                    System.out.println("Usas curación (+20 HP).");
                } else {
                    System.out.println("¡No tienes suficiente MP!");
                }
            }

            // Turno del Monstruo
            if (hpMonstruo > 0) {
                int danioM = generarDanyo(5, 15);
                hpHeroe = hpHeroe - danioM;
                System.out.println("El monstruo ataca: -" + danioM + " HP.");
            }
        }
        finalizarPartida(hpHeroe);
    }

    public static int generarDanyo(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min + 1) + min;
    }

    public static void mostrarEstado(String nombre, int hp, int mp, int hpEnemigo) {
        System.out.println("\n--- ESTADO ACTUAL ---");
        System.out.println("HÉROE: " + nombre + " | HP: " + hp + " | MP: " + mp);
        System.out.println("MONSTRUO: " + Math.max(0, hpEnemigo) + " HP");
        System.out.println("----------------------");
        System.out.print("1. Ataque | 2. Especial (5MP) | 3. Curar (8MP)\nElige: ");
    }

    public static boolean tieneEnergia(int mpActual, int coste) {
        return mpActual >= coste;
    }
    public static int calcularCritico(int danyo) {
        double probabilidad = Math.random(); // Genera entre 0.0 y 1.0
        if (probabilidad > 0.8) {
            int critico = (int) (danyo * 1.5);
            System.out.println(">> ¡GOLPE CRÍTICO! Daño: " + critico);
            return critico;
        }
        System.out.println(">> Daño causado: " + danyo);
        return danyo;
    }
    public static int leerOpcion(Scanner sc) {
        return sc.nextInt();
    }

    public static void finalizarPartida(int hp) {
        if (hp > 0) System.out.println("\n¡VICTORIA!");
        else System.out.println("\nHAS CAÍDO EN COMBATE...");
    }
}