package Herencia.Empresa;

public class Incidencia {
    private int id;
    private String nombre;
    private String fechaRegistro;
    private String fechaCierre;
    private Estado estado;
    private Criticidad criticidad;
    private Dispositivo equipo;
    private int diasTranscurridos;

    public Incidencia(int id, String nombre, String fecha, Criticidad criticidad, Dispositivo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaRegistro = fecha;
        this.fechaCierre = null;
        this.estado = Estado.REGISTRADA;
        this.criticidad = criticidad;
        this.equipo = equipo;
        this.diasTranscurridos = 0;
    }

    public void setDiasTranscurridos(int d) {

        this.diasTranscurridos = d;
    }

    protected boolean esUrgente() {
        boolean urgente = false;
        if (criticidad == Criticidad.CRITICA) urgente = true;
        else if (criticidad == Criticidad.GRAVE && diasTranscurridos >= 7) urgente = true;
        else if (criticidad == Criticidad.MEDIA && diasTranscurridos >= 30) urgente = true;
        return urgente;
    }

    @Override
    public String toString() {
        return nombre + " - " + estado + ": " + criticidad + " - " + fechaRegistro + " - " + equipo.getNombre();
    }
}
