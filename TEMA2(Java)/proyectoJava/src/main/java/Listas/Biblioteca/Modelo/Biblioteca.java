package unidad4.Listas.Biblioteca.Modelo;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Agregar libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Buscar libro por título o autor
    public Libro buscarLibro(String texto) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(texto) ||
                    l.getAutor().equalsIgnoreCase(texto)) {
                return l;
            }
        }
        return null;
    }

    // Prestar libro
    public void prestarLibro(String texto) throws BibliotecaException {
        Libro libroEncontrado = buscarLibro(texto);

        if (libroEncontrado == null) {
            throw new BibliotecaException("El libro no está en el inventario.");
        }

        libroEncontrado.prestar();
    }

    // Devolver libro
    public void devolverLibro(String texto) throws BibliotecaException {
        Libro libroEncontrado = buscarLibro(texto);

        if (libroEncontrado == null) {
            throw new BibliotecaException("El libro no está en el inventario.");
        }

        libroEncontrado.devolver();
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    // Mostrar detalle de un libro
    public void mostrarDetalle(String texto) {
        Libro libroEncontrado = buscarLibro(texto);

        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}