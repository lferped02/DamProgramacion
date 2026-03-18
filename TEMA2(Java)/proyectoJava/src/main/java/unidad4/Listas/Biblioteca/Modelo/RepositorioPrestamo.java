package unidad4.Listas.Biblioteca.Modelo;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;

import java.util.LinkedHashSet;

public class RepositorioPrestamo {
    private LinkedHashSet<Prestamo> prestamos;
    private int contadorId;

    public RepositorioPrestamo() {
        prestamos = new LinkedHashSet<>();
        contadorId = 1;
    }

    public void agregarPrestamo(Libro libro, String usuario) {
        Prestamo nuevo = new Prestamo(contadorId, libro, usuario);

        if (!prestamos.contains(nuevo)) {
            try {
                libro.prestar();
                prestamos.add(nuevo);
                contadorId++;
                System.out.println("Préstamo realizado correctamente.");
            } catch (BibliotecaException e) {
                System.out.println("No es posible realizar el préstamo de un libro que ya está prestado.");
            }
        } else {
            System.out.println("El préstamo ya existe.");
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

    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }

    public void buscarPrestamosPorLibro(String titulo, String autor) {
        boolean encontrado = false;
        for (Prestamo p : prestamos) {
            if (p.getLibro().getTitulo().equalsIgnoreCase(titulo) &&
                    p.getLibro().getAutor().equalsIgnoreCase(autor)) {
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay préstamos para ese libro.");
        }
    }
}