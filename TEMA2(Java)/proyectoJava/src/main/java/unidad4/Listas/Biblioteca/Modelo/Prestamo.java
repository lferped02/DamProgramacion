package unidad4.Listas.Biblioteca.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private int id;
    private Libro libro;
    private String nombreUsuario;
    private LocalDate fechaPrestamo;

    public Prestamo(int id, Libro libro, String nombreUsuario) {
        this.id = id;
        this.libro = libro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = LocalDate.now();
    }

    public Libro getLibro() { return libro; }
    public String getNombreUsuario() { return nombreUsuario; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestamo)) return false;
        Prestamo p = (Prestamo) o;
        return libro.getTitulo().equalsIgnoreCase(p.libro.getTitulo()) &&
                libro.getAutor().equalsIgnoreCase(p.libro.getAutor()) &&
                nombreUsuario.equalsIgnoreCase(p.nombreUsuario) &&
                fechaPrestamo.equals(p.fechaPrestamo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro.getTitulo().toLowerCase(), libro.getAutor().toLowerCase(),
                nombreUsuario.toLowerCase(), fechaPrestamo);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Libro: " + libro + " | Usuario: " + nombreUsuario +
                " | Fecha: " + fechaPrestamo;
    }
}