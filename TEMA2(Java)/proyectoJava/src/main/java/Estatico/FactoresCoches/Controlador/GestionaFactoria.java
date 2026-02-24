package Estatico.FactoresCoches.Controlador;

import Estatico.FactoresCoches.Modelo.*;

public class GestionaFactoria {
    private DispositivoWifi[] inventarioDispositivos = new DispositivoWifi[40];
    public GestionaFactoria() {

        inventarioDispositivos[0] = new SensorTemperatura(1, "AA:BB:CC", EstadoDispositivo.ON_SINWIFI, 22.5);
        inventarioDispositivos[1] = new CamaraSeguridad(2, "DD:EE:FF", EstadoDispositivo.ON_SINWIFI);
        inventarioDispositivos[2] = new PuertaAutomatica(3, "GG:HH:II", EstadoDispositivo.ON_SINWIFI);
    }

    public void mostrarDispositivos() {
        for (int i = 0; i < inventarioDispositivos.length; i++) {
            if (inventarioDispositivos[i] != null) {
                System.out.println(inventarioDispositivos[i]);
            }
        }
    }
}