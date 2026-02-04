package OrientacionAObjetos.DatosClimatologicos;

import java.time.LocalDate;

public class RegistroDiario {
    public String lugar;
    public LocalDate fecha;
    public DatosClimatologicos datos;

    public RegistroDiario(String lugar, LocalDate fecha, DatosClimatologicos datos) {
        this.lugar = lugar;
        this.fecha = fecha;
        this.datos = datos;
    }
}