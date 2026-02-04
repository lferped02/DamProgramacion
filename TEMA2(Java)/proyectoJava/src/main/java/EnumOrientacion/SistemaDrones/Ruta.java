package EnumOrientacion.SistemaDrones;

class Ruta {
    public String origen;
    public String destino;
    public double pesoPaquete;
    public EstadoPaquete estadoPaquete;

    public Ruta(String origen, String destino, double pesoPaquete) {
        this.origen = origen;
        this.destino = destino;
        this.pesoPaquete = pesoPaquete;
        this.estadoPaquete = EstadoPaquete.ENPREPARACION;
    }

    public void setEstadoPaquete(EstadoPaquete nuevoEstado) {
        this.estadoPaquete = nuevoEstado;
    }

    public EstadoPaquete getEstadoPaquete() { return estadoPaquete; }

    @Override
    public String toString() {
        return "Ruta a " + destino + " [" + estadoPaquete + "]";
    }
}
