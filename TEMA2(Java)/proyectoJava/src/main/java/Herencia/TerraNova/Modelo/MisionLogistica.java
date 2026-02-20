package Herencia.TerraNova.Modelo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MisionLogistica extends Mision {
    private double carga;

    public MisionLogistica(int codigo, String nombreClave, LocalDate fecha, Nave nave, double carga) {
        super(codigo, nombreClave, fecha, nave);
        this.carga = carga;
    }

    @Override
    public boolean esMisionRiesgo() {
        boolean muchaCarga = carga > 50;
        DayOfWeek dia = fechaLanzamiento.getDayOfWeek();
        boolean finSemana = (dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY);
        return muchaCarga && finSemana;
    }

    @Override
    public String toString() {
        return "[Logística] " + super.toString();
    }
}
