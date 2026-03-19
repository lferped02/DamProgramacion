package unidad4.Listas.Biblioteca.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;
    private RepositorioPrestamo repositorioPrestamo;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.repositorioPrestamo = new RepositorioPrestamo();
    }

    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            System.out.println("Libro agregado al inventario.");
        } else {
            System.out.println("El libro ya existe en la biblioteca.");
        }
    }

    // 🔥 CORRECTO
    public Libro buscarLibro(String titulo, String autor) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo) &&
                    l.getAutor().equalsIgnoreCase(autor)) {
                return l;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void mostrarDetalle(String titulo, String autor) {
        Libro libro = buscarLibro(titulo, autor);
        if (libro != null) {
            libro.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public RepositorioPrestamo getRepositorioPrestamo() {
        return repositorioPrestamo;
    }
}