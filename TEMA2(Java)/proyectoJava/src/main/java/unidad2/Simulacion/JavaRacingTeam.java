package unidad2.Simulacion;

import java.util.Scanner;

public class JavaRacingTeam {
    static Scanner scanner = new Scanner(System.in);
    String[] nombresPilotos = new String[100];
    double[] tiemposPilotos = new double[100];
    int contadorPilotos = 0;

    public static void main(String[] args) {
        JavaRacingTeam programa = new JavaRacingTeam();
        programa.ejecutarMenu();
    }

    public void ejecutarMenu() {
        int opcion = -1;
        while (opcion != 6) {
            System.out.println("\n--- MENÚ DE CONTROL RACING ---");
            System.out.println("1. Cargar/Reiniciar Datos");
            System.out.println("2. Formatear Nombres");
            System.out.println("3. Ver Estadísticas");
            System.out.println("4. Buscar Piloto");
            System.out.println("5. Generar IDs de Carrera");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    inicializaEscuderia(scanner, nombresPilotos, tiemposPilotos);
                    break;
                case 2:
                    formatearPilotos(nombresPilotos);
                    break;
                case 3:
                    obtenerEstadisticas(nombresPilotos, tiemposPilotos);
                    break;
                case 4:
                    buscarPiloto(nombresPilotos, tiemposPilotos);
                    break;
                case 5:
                    generarIds(nombresPilotos);
                    break;
                case 6:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Error: Opción no válida.");
            }
        }
    }
    public int inicializaEscuderia(Scanner scanner, String[]nombresPilotos, double[]tiemposPilotos) {
        System.out.println("Introduce el número de pilotos (Máximo 100): ");
        contadorPilotos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < contadorPilotos && i < nombresPilotos.length; i++) {
            System.out.print("Nombre del piloto " + (i + 1) + ": ");
            nombresPilotos[i] = scanner.nextLine();

            System.out.print("Tiempo del piloto " + (i + 1) + ": ");
            tiemposPilotos[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("Se han inicializado " + contadorPilotos + " pilotos.");
        return contadorPilotos;
    }

    public void formatearPilotos(String[]nombresPilotos) {
        if (contadorPilotos == 0) {
            System.out.println("No hay pilotos cargados.");
            return;
        }
        for (int i = 0; i < contadorPilotos; i++) {
            String nombreProcesado = nombresPilotos[i].trim().toUpperCase();
            if (nombreProcesado.length() > 10) {
                nombreProcesado = nombreProcesado.substring(0, 10) + ".";
            }
            nombresPilotos[i] = nombreProcesado;
        }
        System.out.println("Nombres formateados con éxito.");
    }

    public void obtenerEstadisticas(String[]nombresPilotos, double[]tiemposPilotos) {
        if (contadorPilotos == 0) {
            System.out.println("No hay datos suficientes para calcular estadísticas.");
            return;
        }
        double sumaTiempos = 0;
        double mejorTiempo = tiemposPilotos[0];
        String pilotoMasRapido = nombresPilotos[0];
        for (int i = 0; i < contadorPilotos; i++) {
            // Acumular para la media
            sumaTiempos += tiemposPilotos[i];
            if (tiemposPilotos[i] < mejorTiempo) {
                mejorTiempo = tiemposPilotos[i];
                pilotoMasRapido = nombresPilotos[i];
            }
        }
        double tiempoMedio = sumaTiempos / contadorPilotos;

        System.out.println("\n--- ESTADÍSTICAS DE LA SESIÓN ---");
        System.out.println("Tiempo medio de vuelta: " + tiempoMedio + " segundos.");
        System.out.println("Mejor tiempo: " + mejorTiempo + " segundos.");
        System.out.println("Piloto más rápido: " + pilotoMasRapido);

        System.out.println("Calculando estadísticas...");
    }
    public double buscarPiloto(String[]nombresP, double[]tiemposPilotos) {
        boolean encontrado = false;
        int i=0;

        System.out.println("Buscando...");
    }
    public String generarIds(String[]nombresPilotos) {
        System.out.println("Generando IDs...");
    }
}