package unidad4.Listas.Biblioteca.Modelo;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String texto) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(texto) ||
                    l.getAutor().equalsIgnoreCase(texto)) {
                return l;
            }
        }
        return null;
    }

    public void prestarLibro(String texto) throws BibliotecaException {
        Libro l = buscarLibro(texto);
        if (l == null) {
            throw new BibliotecaException("El libro no está en el inventario.");
        }
        l.prestar();
    }

    public void devolverLibro(String texto) throws BibliotecaException {
        Libro l = buscarLibro(texto);
        if (l == null) {
            throw new BibliotecaException("El libro no está en el inventario.");
        }
        l.devolver();
    }

    public void mostrarLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void mostrarDetalle(String texto) {
        Libro l = buscarLibro(texto);
        if (l != null) {
            l.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}
