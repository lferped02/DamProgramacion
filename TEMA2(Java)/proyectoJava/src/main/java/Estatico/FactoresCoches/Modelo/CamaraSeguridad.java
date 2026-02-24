package Estatico.FactoresCoches.Modelo;

import java.time.LocalDate;

public class CamaraSeguridad extends DispositivoWifi {
    public CamaraSeguridad(int id, String mac, EstadoDispositivo estado) {
        super(id, mac, estado);
    }

    @Override
    public void conectarInternet() {
        estado = EstadoDispositivo.ON_CONECTADO;
        System.out.println("Conectado mediante WPA3");
    }

    @Override
    public boolean pendienteActualizacion() {
        LocalDate hoy = LocalDate.now();
        return fechaActualizacion.plusWeeks(2).isBefore(hoy);
    }
}
