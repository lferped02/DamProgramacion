package Estatico.FactoriaDeCoches.Modelo;

public class CamaraSeguridad extends DispositivoWifi {

    public CamaraSeguridad(String id, String mac, String estado, String fechaActualizacion) {
        super(id, mac, estado, fechaActualizacion);
    }

    @Override
    protected String obtenerProtocolo() {
        return "WPA3";
    }
}