package unidad4.Listas.Biblioteca.Modelo;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            System.out.println("Libro agregado al inventario.");
        } else {
            System.out.println("El libro ya existe en la biblioteca.");
        }
    }

    public Libro buscarLibro(String texto) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(texto) || l.getAutor().equalsIgnoreCase(texto)) {
                return l;
            }
        }
        return null;
    }

    public void prestarLibro(String texto) throws BibliotecaException {
        Libro libro = buscarLibro(texto);
        if (libro == null) {
            throw new BibliotecaException("El libro no está en el inventario.");
        }
        libro.prestar();
    }

    public void devolverLibro(String texto) throws BibliotecaException {
        Libro libro = buscarLibro(texto);
        if (libro == null) {
            throw new BibliotecaException("El libro no está en el inventario.");
        }
        libro.devolver();
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

    public void mostrarDetalle(String texto) {
        Libro libro = buscarLibro(texto);
        if (libro != null) {
            libro.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}