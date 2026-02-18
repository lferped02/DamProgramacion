package Herencia.Terranova;

import java.time.LocalDate;

public abstract class Mision {
    private int codigo;
    private String nombreClave;
    protected LocalDate fechaLanzamiento;
    private Nave nave;
    private EstadoMision estado;

    public Mision(int codigo, String nombreClave, LocalDate fechaLanzamiento, Nave nave) {
        this.codigo = codigo;
        this.nombreClave = nombreClave;
        this.nave = nave;
        this.estado = EstadoMision.PLANIFICADA;

        if (fechaPasado(fechaLanzamiento)) {
            this.fechaLanzamiento = LocalDate.now();
        } else {
            this.fechaLanzamiento = fechaLanzamiento;
        }
    }

    private boolean fechaPasado(LocalDate fechaRecibida) {
        return fechaRecibida.isBefore(LocalDate.now());
    }

    protected abstract boolean esMisionDeRiesgo();

    @Override
    public String toString() {
        return "Mision{" +
                "nombreClave='" + nombreClave + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", estado=" + estado +
                '}';
    }
}

