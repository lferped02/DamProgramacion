package Herencia.TerraNova;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Mision {

    protected int codigo;
    protected String nombreClave;
    protected LocalDate fechaLanzamiento;
    protected Nave nave;
    protected EstadoMision estado;

    public Mision(int codigo, String nombreClave, LocalDate fechaLanzamiento, Nave nave) {

        if (fechaLanzamiento.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser pasada");
        }

        this.codigo = codigo;
        this.nombreClave = nombreClave;
        this.fechaLanzamiento = fechaLanzamiento;
        this.nave = nave;
        this.estado = EstadoMision.PLANIFICADA;
    }

    public abstract boolean esMisionRiesgo();

    @Override
    public String toString() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "[" + this.getClass().getSimpleName().replace("Mision", "") + "] "
                + codigo + ": " + nombreClave + " - "
                + fechaLanzamiento.format(formato)
                + " (" + estado + ") -> "
                + nave;
    }
}