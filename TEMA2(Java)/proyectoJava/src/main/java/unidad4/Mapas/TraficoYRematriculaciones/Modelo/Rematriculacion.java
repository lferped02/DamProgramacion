package unidad4.Mapas.TraficoYRematriculaciones.Modelo;

import java.time.LocalDate;

public class Rematriculacion {
    private String matricula;
    private LocalDate fecha;

    public Rematriculacion(String matricula, LocalDate fecha) {
        this.matricula = matricula;
        this.fecha = fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String toString() {
        return matricula + " - " + fecha;
    }
}