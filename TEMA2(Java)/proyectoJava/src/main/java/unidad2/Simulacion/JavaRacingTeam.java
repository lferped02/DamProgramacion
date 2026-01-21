package unidad2.Simulacion;

import java.util.Scanner;

public class JavaRacingTeam {
    public static String[] nombresPilotos = new String[100];
    public static double[] tiemposPilotos = new double[100];
    public static int contadorPilotos = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ejecutarMenu();
    }

    public static void ejecutarMenu() {
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("\n--- GESTIÓN JAVA RACING TEAM ---");
            System.out.println("1. Cargar/Reiniciar Datos");
            System.out.println("2. Formatear Nombres");
            System.out.println("3. Ver Estadísticas");
            System.out.println("4. Buscar Piloto");
            System.out.println("5. Generar IDs de Carrera");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, introduce un número.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    inicializarEscuderia(nombresPilotos, tiemposPilotos);
                    break;
                case 2:
                    formatearPilotos(nombresPilotos);
                    break;
                case 3:
                    obtenerEstadisticas(nombresPilotos);
                    break;
                case 4:
                    System.out.print("Dime el nombre del piloto a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    double tiempoEncontrado = buscarPiloto(nombresPilotos, tiemposPilotos, nombreBusqueda, contadorPilotos);
                    if (tiempoEncontrado != -1) {
                        System.out.println("El piloto " + nombreBusqueda + " tiene un tiempo de: " + tiempoEncontrado + " segundos.");
                    } else {
                        System.out.println("El piloto '" + nombreBusqueda + "' no se encuentra en el sistema.");
                    }
                    break;
                case 5:
                    generarIDS(nombresPilotos);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }
    }

    public static int inicializarEscuderia(String[] nombresPilotos, double[] tiemposPilotos) {
        System.out.print("¿Cuántos pilotos quieres registrar? ");
        contadorPilotos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < contadorPilotos; i++) {
            System.out.print("Nombre del piloto " + (i + 1) + ": ");
            nombresPilotos[i] = scanner.nextLine();

            double tiempo;
            do {
                System.out.print("Tiempo de vuelta para " + nombresPilotos[i] + " (segundos): ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Error: Introduce un número válido.");
                    scanner.next();
                }
                tiempo = scanner.nextDouble();
                if (tiempo < 0) {
                    System.out.println("El tiempo no puede ser negativo. Reinténtalo.");
                }
            } while (tiempo < 0);

            tiemposPilotos[i] = tiempo;
            scanner.nextLine();
        }
        System.out.println("Datos cargados correctamente.");
        return contadorPilotos;
    }

    public static void formatearPilotos(String[] nombresPilotos) {
        if (contadorPilotos == 0) {
            System.out.println("No hay pilotos registrados.");
            return;
        }
        for (int i = 0; i < contadorPilotos; i++) {
            if (nombresPilotos[i] != null) {
                String nombre = nombresPilotos[i].trim().toUpperCase();
                if (nombre.length() > 10) {
                    nombre = nombre.substring(0, 10) + ".";
                }
                nombresPilotos[i] = nombre;
            }
        }
        System.out.println("Nombres formateados.");
    }

    public static void obtenerEstadisticas(String[] nombresPilotos) {
        if (contadorPilotos == 0) {
            System.out.println("No hay datos para estadísticas.");
            return;
        }
        double sumaTiempos = 0;
        double mejorTiempo = tiemposPilotos[0];
        String nombreMejor = nombresPilotos[0];

        for (int i = 0; i < contadorPilotos; i++) {
            sumaTiempos += tiemposPilotos[i];
            if (tiemposPilotos[i] < mejorTiempo) {
                mejorTiempo = tiemposPilotos[i];
                nombreMejor = nombresPilotos[i];
            }
        }
        double media = sumaTiempos / contadorPilotos;
        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.printf("Tiempo medio: %.2fs\n", media);
        System.out.println("Piloto más rápido: " + nombreMejor + " con " + mejorTiempo + "s");
    }

    public static double buscarPiloto(String[] nombresPilotos, double[] tiemposPilotos, String nombre, int numeroPilotos) {
        boolean encontrado = false;
        for (int i = 0; i < numeroPilotos; i++) {
            if (nombresPilotos[i] != null && nombresPilotos[i].equalsIgnoreCase(nombre)) {
                return tiemposPilotos[i];
            }
        }
        return -1;
    }

    public static String[] generarIDS(String[] nombresPilotos) {
        if (contadorPilotos == 0) {
            System.out.println("No hay pilotos para generar IDs.");
            return new String[0];
        }
        String[] ids = new String[contadorPilotos];
        System.out.println("\n--- GENERANDO LISTADO DE IDs ---");
        for (int i = 0; i < contadorPilotos; i++) {
            String nombreActual = nombresPilotos[i];
            int limite = Math.min(nombreActual.length(), 3);
            String letras = nombreActual.substring(0, limite).toUpperCase();
            String nuevoId = letras + "-" + i;
            ids[i] = nuevoId;

            System.out.println("Piloto: " + nombreActual + " -> ID: " + nuevoId);
        }


        return ids;
    }
}