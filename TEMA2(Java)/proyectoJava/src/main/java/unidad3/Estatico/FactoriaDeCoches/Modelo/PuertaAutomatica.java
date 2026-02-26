package Estatico.FactoriaDeCoches.Modelo;

public class PuertaAutomatica extends DispositivoWifi {

    public PuertaAutomatica(String id, String mac, String estado, String fechaActualizacion) {
        super(id, mac, estado, fechaActualizacion);
    }

    @Override
    protected String obtenerProtocolo() {
        return "WPA2";
    }
}
