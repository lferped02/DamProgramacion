package Estatico.FactoriaDeCoches.Modelo;

public abstract class DispositivoWifi {
    protected String id;
    protected String mac;
    protected String estado;
    protected String fechaActualizacion;

    public DispositivoWifi(String id, String mac, String estado, String fechaActualizacion) {
        this.id = id;
        this.mac = mac;
        this.estado = estado;
        this.fechaActualizacion = fechaActualizacion;
    }

    public void conectarInternet() {
        System.out.println("Conectando dispositivo con protocolo de seguridad " + obtenerProtocolo() + "...");
    }

    public boolean pendienteActualizacion() {
        return this instanceof SensorTemperatura && this.fechaActualizacion.equals("Hace 3 meses.") ||
                this instanceof CamaraSeguridad && this.fechaActualizacion.equals("Hace 2 semanas.") ||
                this instanceof PuertaAutomatica && this.fechaActualizacion.equals("Hace 1 mes.");
    }

    public void apagar() {
        this.estado = "OFF";
        System.out.println("Dispositivo apagado.");
    }

    protected abstract String obtenerProtocolo();

    @Override
    public String toString() {
        return "DispositivoWifi{" +
                "id='" + id + '\'' +
                ", mac='" + mac + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
