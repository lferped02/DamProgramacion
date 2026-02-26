package EnumOrientacion.SistemaDrones.Modelo;

public class Ruta {
    private String origen;
    private String destino;
    private double pesoPaquete;
    private EstadoPaquete estado;

    public Ruta(String origen, String destino, double pesoPaquete) {
        this.origen = origen;
        this.destino = destino;
        this.pesoPaquete = pesoPaquete;
        this.estado = EstadoPaquete.ENPREPARACION;
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public void setEstado(EstadoPaquete estado) {
        this.estado = estado;
    }

    public EstadoPaquete getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", peso=" + pesoPaquete + "kg" +
                ", estado=" + estado +
                '}';
    }
}