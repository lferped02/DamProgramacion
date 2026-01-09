package unidad2.RepasoNavidad;

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
                mostrarInterfaz(nombre, hpHeroe, mpHeroe, hpMonstruo);
                int opcion = leerOpcion(scanner);

                if (opcion == 1) {
                    int danio = generarAleatorio(7, 12);
                    hpMonstruo -= danio;
                    System.out.println(">> Atacas al monstruo causando " + danio + " de daño.");
                }
                else if (opcion == 2) {
                    if (mpHeroe >= 5) {
                        int danio = generarAleatorio(15, 25);
                        hpMonstruo -= danio;
                        mpHeroe -= 5;
                        System.out.println(">> ¡ATAQUE ESPECIAL! Causas " + danio + " de daño.");
                    } else {
                        System.out.println(">> No tienes maná suficiente...");
                    }
                }
                else if (opcion == 3) {
                    if (mpHeroe >= 8) {
                        hpHeroe += 20;
                        mpHeroe -= 8;
                        System.out.println("Usas magia de curación (+20 HP).");
                    } else {
                        System.out.println("No tienes maná suficiente...");
                    }
                }
                if (hpMonstruo > 0) {
                    int danioM = generarAleatorio(5, 15);
                    hpHeroe -= danioM;
                    System.out.println("<<   El monstruo te golpea causándote " + danioM + " de daño.");
                }
            }

            finalizarPartida(hpHeroe, hpMonstruo);
        }
        public static void mostrarInterfaz(String nom, int hp, int mp, int hpM) {
            System.out.println("\n========================================");
            System.out.println(" JUGADOR: " + nom + " | HP: " + hp + " | MP: " + mp);
            System.out.println(" MONSTRUO: " + hpM + " HP");
            System.out.println("========================================");
            System.out.println("1. Ataque | 2. Especial (5MP) | 3. Curar (8MP)");
            System.out.print("Elige acción: ");
        }

        public static int leerOpcion(Scanner sc) {
            int opcion = sc.nextInt();
            return opcion;
        }

        public static int generarAleatorio(int min, int max) {
            Random rd = new Random();
            // nextInt(max - min + 1) + min es la fórmula estándar en DAM
            return rd.nextInt(max - min + 1) + min;
        }

        public static void finalizarPartida(int hpHeroe, int hpMonstruo) {
            if (hpHeroe <= 0) {
                System.out.println("\n--- HAS MUERTO. GAME OVER ---");
            } else {
                System.out.println("\n--- ¡VICTORIA! EL MONSTRUO HA SIDO DERROTADO ---");
            }
        }
    }