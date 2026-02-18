package Herencia.Empresa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Incidencia {
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaRegistro;
    private LocalDate fechaCierre;
    private Estado estado;
    private Criticidad criticidad;
    private Dispositivo equipo;

    public Incidencia(int id, String nombre, String descripcion, Criticidad criticidad, Dispositivo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.criticidad = criticidad;
        this.equipo = equipo;
        this.fechaRegistro = LocalDate.now();
        this.estado = Estado.REGISTRADA;
        this.fechaCierre = null;
        equipo.incrementarPendientes();
    }

    protected boolean esUrgente() {
        LocalDate hoy = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(this.fechaRegistro, hoy);

        if (this.criticidad == Criticidad.CRITICA) {
            return true;
        } else if (this.criticidad == Criticidad.GRAVE && dias >= 7) {
            return true;
        } else if (this.criticidad == Criticidad.MEDIA && dias >= 30) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + " - " + estado + ": " + criticidad + " - " + fechaRegistro + " - " + equipo.getNombre();
    }
}