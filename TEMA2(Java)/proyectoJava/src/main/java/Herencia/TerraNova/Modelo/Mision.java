package Herencia.TerraNova.Modelo;

import java.time.LocalDate;

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
        return codigo + ": " + nombreClave +
                " - " + fechaLanzamiento +
                " (" + estado + ") -> " + nave;
    }
}

