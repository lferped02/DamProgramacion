package unidad4.Ordenaciones.HistorialDeNavegacion.Controlador;

import unidad4.Ordenaciones.HistorialDeNavegacion.Excepciones.HistorialException;
import unidad4.Ordenaciones.HistorialDeNavegacion.Modelo.PaginaWeb;
import unidad4.Ordenaciones.HistorialDeNavegacion.Repositorio.Historial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GestionaHistorial {

    public static void main(String[] args) {
        Historial historial = new Historial();
        Scanner scanner = new Scanner(System.in);
        int op;

        try {
            historial.agregarPagina("google.com", LocalDate.now().minusDays(2));
            historial.agregarPagina("google.com", null);
            historial.agregarPagina("youtube.com", LocalDate.now().minusDays(1));
            historial.agregarPagina("youtube.com", null);
            historial.agregarPagina("youtube.com", LocalDate.now().minusDays(3));
            historial.agregarPagina("google.com", LocalDate.now().plusDays(1));

        } catch (HistorialException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- HISTORIAL ---");
        historial.mostrarHistorial();

        System.out.println("\n--- GOOGLE ---");
        historial.consultarPorUrl("google.com");

        do {
            System.out.println("\n1.Agregar página historial.");
            System.out.println("2.Mostrar todo el historial.");
            System.out.println("3.Buscar por fecha del historial.");
            System.out.println("4.Buscar por url");
            System.out.println("5.Borrar por url");
            System.out.println("6.Ordenar por url");
            System.out.println("7.Salir");

            op = Integer.parseInt(scanner.nextLine());

            try {
                switch (op) {
                    case 1:
                        System.out.print("URL: ");
                        String url = scanner.nextLine();

                        System.out.print("Fecha (yyyy-mm-dd o vacío): ");
                        String f = scanner.nextLine();

                        LocalDate fecha = f.isEmpty() ? null : LocalDate.parse(f);

                        historial.agregarPagina(url, fecha);
                        break;

                    case 2:
                        historial.mostrarHistorial();
                        break;

                    case 3:
                        System.out.print("Fecha: ");
                        LocalDate fechaBuscar = LocalDate.parse(scanner.nextLine());
                        historial.consultarPorFecha(fechaBuscar);
                        break;

                    case 4:
                        System.out.print("URL: ");
                        historial.consultarPorUrl(scanner.nextLine());
                        break;

                    case 5:
                        System.out.print("URL: ");
                        historial.borrarPorUrl(scanner.nextLine());
                        break;

                    case 6:
                        List<PaginaWeb> lista = new ArrayList<>(historial.getHistorial());
                        lista.sort(Comparator.comparing(PaginaWeb::getUrl));

                        for (PaginaWeb p : lista) {
                            System.out.println(p);
                        }
                        break;

                    case 7:
                        System.out.println("Fin");
                        break;

                    default:
                        System.out.println("Error");
                }

            } catch (HistorialException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Dato incorrecto");
            }
        } while (op != 7);

        scanner.close();
    }
}