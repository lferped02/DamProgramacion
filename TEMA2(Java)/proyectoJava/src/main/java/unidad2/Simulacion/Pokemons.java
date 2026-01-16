package unidad2.Simulacion;

import java.util.Random;
import java.util.Scanner;

public class Pokemons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] nombres = new String[20];
        int[] niveles = new int[20];
        int contador = 0;
        int opcion;

        do {
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    contador = capturarPokemon(scanner, nombres, niveles, contador);
                    break;
                case 2:
                    realizarBatalla(random, scanner, nombres, niveles, contador);
                    break;
                case 3:
                    mostrarPokedex(nombres, niveles, contador);
                    break;
                case 4:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Error: Opción no válida.");
            }
        } while (opcion != 4);
    }
    public static void menu() {
        System.out.println("------MENÚ------");
        System.out.println("1. Capturar Pokémon");
        System.out.println("2. Realizar Batalla");
        System.out.println("3. Mostrar Pokédex");
        System.out.println("4. Fianlizar");
        System.out.print("Selecciona: ");
    }
    public static int capturarPokemon(Scanner scanner, String[] nombres, int[] niveles, int contador) {
        if (contador < nombres.length) {
            System.out.print("Introduce el nombre del Pokémon: ");
            nombres [contador] = scanner.nextLine();

            System.out.print("Introduce el nivel: ");
            niveles[contador] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("¡Este Pokemón está capturado!");
            contador++;
        } else {
            System.out.println("Error: Almacenamiento lleno.");
        }
        return contador;
    }

    public static void realizarBatalla(Random random, Scanner scanner, String [] nombres, int [] niveles, int contador) {
        System.out.println("¡Iniciando combate aleatorio...!");
        int pos = 0;
        int posicion = scanner.nextInt();
        int rivalposicion = scanner.nextInt();

        //Pokemon elegidos por el entrenador
        String pokemonsElegidos = nombres[posicion];
        int niveleselegidos = niveles[posicion];
        //Pokemon elegidos por el rival
        String pokemonsRivales = nombres[rivalposicion];
        int nivelesRivales = niveles[rivalposicion];
        
        if (niveleselegidos > nivelesRivales){
            System.out.println("Has ganado el combate has subido un punto");
        } else if (niveleselegidos == nivelesRivales) {
            
        }
    }

    public static void mostrarPokedex(String[] nombres, int[] niveles, int contador) {
            for (int i = 0; i < contador; i++) {
                System.out.println(" " + nombres[i] + " - Nivel: " + niveles[i]);

        }
    }
}