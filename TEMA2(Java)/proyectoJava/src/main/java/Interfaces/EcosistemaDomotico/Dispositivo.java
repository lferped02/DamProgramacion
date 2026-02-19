package Interfaces.EcosistemaDomotico;

abstract class Dispositivo {
    protected String codigoSerie;
    protected String marca;
    protected Estado estado;

    public Dispositivo(String codigoSerie, String marca) {
        this.codigoSerie = codigoSerie;
        this.marca = marca;
        this.estado = Estado.PENDIENTE_CONFIGURACION;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void conectar() {
        System.out.println("Conectando el dispositivo...");
    }

    public void desconectar() {
        System.out.println("Desconectando el dispositivo...");
    }
}
