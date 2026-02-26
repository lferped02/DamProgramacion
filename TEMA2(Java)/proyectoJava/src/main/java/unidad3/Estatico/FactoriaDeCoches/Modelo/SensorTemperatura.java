package Estatico.FactoriaDeCoches.Modelo;

public class SensorTemperatura extends DispositivoWifi {
    private int temperatura;

    public SensorTemperatura(String id, String mac, String estado, String fechaActualizacion, int temperatura) {
        super(id, mac, estado, fechaActualizacion);
        this.temperatura = temperatura;
    }

    @Override
    protected String obtenerProtocolo() {
        return "WPA";
    }
}
