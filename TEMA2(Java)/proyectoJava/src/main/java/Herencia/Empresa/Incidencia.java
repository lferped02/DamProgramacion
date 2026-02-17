package Herencia.Empresa;

public class Incidencia {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaRegistro;
    private String fechaCierre;
    private Estado estado;
    private Criticidad criticidad;
    private Dispositivo equipo;
    private int diasTranscurridos;

    public Incidencia(int id, String nombre, String desc, String fecha, Criticidad criticidad, Dispositivo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = desc;
        this.fechaRegistro = fecha;
        this.fechaCierre = null;
        this.estado = Estado.REGISTRADA;
        this.criticidad = criticidad;
        this.equipo = equipo;
        this.diasTranscurridos = 0;
    }

    public void setDiasTranscurridos(int dias) {
        this.diasTranscurridos = dias;
    }

    public boolean esUrgente() {
        boolean urgente = false;

        if (this.criticidad == Criticidad.CRITICA) {
            urgente = true;
        }

        return urgente;
    }

    @Override
    public String toString() {
        return nombre + " - " + estado + ": " + criticidad + " - " + fechaRegistro + " - " + equipo.getNombre();
    }
}