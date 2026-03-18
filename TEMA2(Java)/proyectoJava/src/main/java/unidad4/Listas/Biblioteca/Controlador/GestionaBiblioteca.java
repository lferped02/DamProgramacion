package unidad4.Listas.Biblioteca.Controlador;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;
import unidad4.Listas.Biblioteca.Modelo.*;

import java.util.Scanner;

public class GestionaBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        RepositorioPrestamo repoPrestamos = new RepositorioPrestamo();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar un nuevo libro al inventario.\n");
            System.out.println("2.Prestar un ejemplar de un libro");
            System.out.println("3. Devolver un ejemplar prestado.");
            System.out.println("4. Mostrar todos los libros en el inventario.");
            System.out.println("5. Mostrar detalle de un libro.");
            System.out.println("6. Buscar libros por título o autor.");
            System.out.println("7. Mostrar historial de préstamos.");
            System.out.println("8. Buscar préstamos por libro.");
            System.out.println("9. Salir del progtama.");
            System.out.print("Introduce una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {

                    case 1:
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Género: ");
                        String genero = scanner.nextLine();
                        System.out.print("Año: ");
                        int anio = Integer.parseInt(scanner.nextLine());
                        biblioteca.agregarLibro(new Libro(titulo, autor, genero, anio));
                        break;

                    case 2:
                        System.out.print("Título o autor del libro: ");
                        String textoPrestar = scanner.nextLine();
                        Libro libroPrestar = biblioteca.buscarLibro(textoPrestar);
                        if (libroPrestar != null) {
                            System.out.print("Nombre usuario: ");
                            String usuario = scanner.nextLine();
                            repoPrestamos.agregarPrestamo(libroPrestar, usuario);
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                        break;

                    case 3:
                        System.out.print("Título o autor del libro: ");
                        String textoDevolver = scanner.nextLine();
                        Libro libroDevolver = biblioteca.buscarLibro(textoDevolver);
                        if (libroDevolver != null) {
                            repoPrestamos.devolverLibro(libroDevolver);
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                        break;

                    case 4:
                        biblioteca.mostrarLibros();
                        break;

                    case 5:
                        System.out.print("Título o autor del libro: ");
                        biblioteca.mostrarDetalle(scanner.nextLine());
                        break;

                    case 6:
                        System.out.print("Buscar por título o autor: ");
                        Libro l = biblioteca.buscarLibro(scanner.nextLine());
                        if (l != null) {
                            l.mostrarInfo();
                        } else {
                            System.out.println("No encontrado.");
                        }
                        break;

                    case 7:
                        repoPrestamos.mostrarPrestamos();
                        break;

                    case 8:
                        System.out.print("Título del libro: ");
                        String tBuscar = scanner.nextLine();
                        System.out.print("Autor del libro: ");
                        String aBuscar = scanner.nextLine();
                        repoPrestamos.buscarPrestamosPorLibro(tBuscar, aBuscar);
                        break;

                    case 9:
                        System.out.println("Salir del programa...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Introduce un número.");
                opcion = 0;
            } catch (BibliotecaException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 9);

        scanner.close();
    }
}