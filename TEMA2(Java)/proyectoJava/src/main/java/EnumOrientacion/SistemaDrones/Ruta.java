package EnumOrientacion.SistemaDrones;

class Ruta {
     String origen;
     String destino;
     double pesoPaquete;
     EstadoPaquete estadoPaquete;

     Ruta(String origen, String destino, double pesoPaquete) {
        this.origen = origen;
        this.destino = destino;
        this.pesoPaquete = pesoPaquete;
        this.estadoPaquete = EstadoPaquete.ENPREPARACION;
    }

     void setEstadoPaquete(EstadoPaquete nuevoEstado) {
        this.estadoPaquete = nuevoEstado;
    }

     EstadoPaquete getEstadoPaquete() {
        return estadoPaquete;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "destino='" + destino + '\'' +
                ", estadoPaquete=" + estadoPaquete +
                '}';
    }
}