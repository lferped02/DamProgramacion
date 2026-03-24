package unidad4.Listas.Biblioteca.Modelo;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepositorioPrestamo {
    private Set<Prestamo> prestamos;

    public RepositorioPrestamo() {
        prestamos = new LinkedHashSet<Prestamo>();
    }

    public void agregarPrestamo(Libro libro, String usuario) {
        try {
            libro.prestar();
            Prestamo nuevo = new Prestamo(libro, usuario);
            prestamos.add(nuevo);
            System.out.println("Préstamo realizado correctamente.");
        } catch (BibliotecaException e) {
            System.out.println("No es posible realizar el préstamo de un libro que ya está prestado.");
        }
    }

    public void devolverLibro(Libro libro) {
        try {
            libro.devolver();
            System.out.println("Libro devuelto correctamente.");
        } catch (BibliotecaException e) {
            System.out.println("No es posible devolver un libro que no está prestado.");
        }
    }

    public Prestamo buscarPrestamo(Libro libro, String usuario) {
        Prestamo prestamoEncontrado = null;

        Iterator<Prestamo> it = this.prestamos.iterator();

        boolean encontrado = false;
        while (!encontrado && it.hasNext()) {
            Prestamo p = it.next();
            if (p.getNombreUsuario().equals(usuario) && p.getLibro().equals(libro)) {
                encontrado = true;
                prestamoEncontrado = p;
            }
        }
        return prestamoEncontrado;
    }

    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
        }
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }

    public Set<Prestamo> buscarPrestamosPorLibro(String titulo, String autor) {
        Set<Prestamo> prestamoFiltrado = new LinkedHashSet<Prestamo>();

        for (Prestamo p : prestamos) {
            if (p.getLibro().getTitulo().equalsIgnoreCase(titulo) &&
                    p.getLibro().getAutor().equalsIgnoreCase(autor)) {
                prestamoFiltrado.add(p);
            }
        }
        return prestamoFiltrado;
    }
}