package EnumOrientacion.SistemaDrones;

class Ruta {
     String origen;
     String destino;
     double pesoPaquete;
     EstadoPaquete estado;

    public Ruta(String origen, String destino, double pesoPaquete) {
        this.origen = origen;
        this.destino = destino;
        this.pesoPaquete = pesoPaquete;
        this.estado = EstadoPaquete.ENPREPARACION;
    }

    public double getPesoPaquete() {
        return pesoPaquete; }
    public void setEstado(EstadoPaquete estado) {
        this.estado = estado; }
    public EstadoPaquete getEstado() {
        return estado; }
}