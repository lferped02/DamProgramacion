package unidad2.BoletinMatrices;

import java.util.Scanner;

public class RadarDeNavegacionEspacial {
    public static void main(String[] args) {
        int[][] mapaEstelar = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapaEstelar[i][j] = (int) (Math.random() * 101);
            }
        }

        RadarDeNavegacionEspacial radar = new RadarDeNavegacionEspacial();
        radar.gestionarMenu(mapaEstelar);
    }
    public void gestionarMenu(int[][] mapa) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n--- RADAR DE NAVEGACIÓN ---");
            System.out.println("1. Identificar Amenazas (>80)");
            System.out.println("2. Calcular Escudo (Suma Total)");
            System.out.println("3. Encontrar el Refugio (Mínimo)");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) identificarAmenazas(mapa);
            else if (opcion == 2) calcularEscudo(mapa);
            else if (opcion == 3) encontrarRefugio(mapa);
            else if (opcion == 6) salir(mapa);
            else System.out.println("Opción no válida.");
        }
    }
    public void identificarAmenazas(int[][] mapa) {
        System.out.println("Posibles agujeros negros detectados en:");
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] > 80) {
                    System.out.println("Fila: " + i + ", Columna: " + j + " (Energía: " + mapa[i][j] + ")");
                }
            }
        }
    }
    public void calcularEscudo(int[][] mapa) {
        int sumaTotal = 0;
        for (int[] fila : mapa) {
            for (int energia : fila) {
                sumaTotal += energia;
            }
        }
        System.out.println("Energía Total del Cuadrante: " + sumaTotal);
        if (sumaTotal > 1000) {
            System.out.println("¡AVISO! Escudos al 100% inmediatamente.");
        }
    }
    public void encontrarRefugio(int[][] mapa) {
        int min = mapa[0][0];
        int filaMin = 0;
        int colMin = 0;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] < min) {
                    min = mapa[i][j];
                    filaMin = i;
                    colMin = j;
                }
            }
        }
        System.out.println("Refugio encontrado. Valor: " + min + " en [" + filaMin + "][" + colMin + "]");
    }

    public void salir(int[][] mapa) {
        System.out.println("Saliendo... Mapa Estelar final:");
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + "\t");
            }
            System.out.println();
        }
    }
}