package unidad2.Simulacion;

import java.util.Scanner;

public class JavaRacingTeam {
    static String[] nombresPilotos = new String[100];
    static double[] tiemposPilotos = new double[100];
    static int contadorPilotos = 0;
    static Scanner teclado = new Scanner(System.in);

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

            opcion = teclado.nextInt();
            teclado.nextLine();

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
                    String nombreBusqueda = teclado.nextLine();
                    double tiempoEncontrado = buscarPiloto(nombreBusqueda);

                    if (tiempoEncontrado == -1) {
                        System.out.println("Error: Piloto no encontrado.");
                    } else {
                        System.out.println("El mejor tiempo de " + nombreBusqueda + " es: " + tiempoEncontrado + "s");
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
    public static int inicializarEscuderia(String[]nombresPilotos, double[]tiemposPilotos) {
        System.out.print("¿Cuántos pilotos quieres registrar? ");
        contadorPilotos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < contadorPilotos; i++) {
            System.out.print("Nombre del piloto " + (i + 1) + ": ");
            nombresPilotos[i] = teclado.nextLine();

            double tiempo;
            do {
                System.out.print("Tiempo de vuelta (segundos): ");
                tiempo = teclado.nextDouble();
                if (tiempo < 0) {
                    System.out.println("El tiempo no puede ser negativo. Reinténtalo.");
                }
            } while (tiempo < 0);

            tiemposPilotos[i] = tiempo;
            teclado.nextLine();
        }
        System.out.println("Datos cargados correctamente.");
        return contadorPilotos;
    }
    public static void formatearPilotos(String[]nombresPilotos) {
        if (contadorPilotos == 0) {
            System.out.println("No hay pilotos registrados.");
            return;
        }

        for (int i = 0; i < contadorPilotos; i++) {
            String nombre = nombresPilotos[i].trim().toUpperCase();
            if (nombre.length() > 10) {
                nombre = nombre.substring(0, 10) + ".";
            }
            nombresPilotos[i] = nombre;
        }
        System.out.println("Nombres formateados.");
    }
    public static void obtenerEstadisticas(String[]nombresPilotos) {
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
        System.out.println("Tiempo medio: " + media + "s");
        System.out.println("Piloto más rápido: " + nombreMejor + " con " + mejorTiempo + "s");
    }
    public static double buscarPiloto(String nombre) {
        for (int i = 0; i < contadorPilotos; i++) {
            if (nombresPilotos[i].equalsIgnoreCase(nombre)) {
                return tiemposPilotos[i];
            }
        }
        return -1;
    }
    public static String generarIDS(String[]nombresPilotos) {
        if (contadorPilotos == 0) {
            System.out.println("No hay pilotos para generar IDs.");
        }

        System.out.println("\n--- LISTADO DE IDs ---");
        for (int i = 0; i < contadorPilotos; i++) {
            String nombreActual = nombresPilotos[i];
            int limite = 3;
            if (nombreActual.length() < 3) {
                limite = nombreActual.length();
            }
            String letras = nombreActual.substring(0, limite).toUpperCase();
            System.out.println("Piloto: " + nombreActual + " -> ID: " + letras + "-" + i);
        }
        return "";
    }
}