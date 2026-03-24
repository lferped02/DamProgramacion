package unidad4.Listas.Biblioteca.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private int id;
    private Libro libro;
    private String nombreUsuario;
    private LocalDate fechaPrestamo;
    private static int contadorId;


    public Prestamo(Libro libro, String nombreUsuario) {
        this.id = contadorId +1;
        contadorId= contadorId +1;
        this.libro = libro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = LocalDate.now();
    }

    public Libro getLibro() { return libro; }
    public String getNombreUsuario() { return nombreUsuario; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestamo)) return false;
        Prestamo p = (Prestamo) o;
        return libro.getTitulo().equalsIgnoreCase(p.libro.getTitulo()) &&
                libro.getAutor().equalsIgnoreCase(p.libro.getAutor()) &&
                nombreUsuario.equalsIgnoreCase(p.nombreUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro.getTitulo().toLowerCase(), libro.getAutor().toLowerCase(),
                nombreUsuario.toLowerCase());
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Libro: " + libro + " | Usuario: " + nombreUsuario +
                " | Fecha: " + fechaPrestamo;
    }
}