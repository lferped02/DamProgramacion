package unidad4.Listas.Biblioteca.Controlador;


import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;
import unidad4.Listas.Biblioteca.Modelo.Biblioteca;
import unidad4.Listas.Biblioteca.Modelo.Libro;

import java.util.Scanner;

public class GestionaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Mostrar detalle");
            System.out.println("6. Buscar libro");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

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
                        System.out.print("Cantidad: ");
                        int cantidad = Integer.parseInt(scanner.nextLine());

                        biblioteca.agregarLibro(new Libro(titulo, autor, genero, anio, cantidad));
                        break;

                    case 2:
                        System.out.print("Título o autor: ");
                        biblioteca.prestarLibro(scanner.nextLine());
                        break;

                    case 3:
                        System.out.print("Título o autor: ");
                        biblioteca.devolverLibro(scanner.nextLine());
                        break;

                    case 4:
                        biblioteca.mostrarLibros();
                        break;

                    case 5:
                        System.out.print("Título o autor: ");
                        biblioteca.mostrarDetalle(scanner.nextLine());
                        break;

                    case 6:
                        System.out.print("Buscar: ");
                        Libro l = biblioteca.buscarLibro(scanner.nextLine());
                        if (l != null) {
                            l.mostrarInfo();
                        } else {
                            System.out.println("No encontrado.");
                        }
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Introduce un número.");
                opcion = 0;
            } catch (BibliotecaException e) {
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }

        } while (opcion != 7);
    }
}