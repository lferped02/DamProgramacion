package Estatico.FactoresCoches.Modelo;

import java.time.LocalDate;

public class PuertaAutomatica extends DispositivoWifi {
    public PuertaAutomatica(int id, String mac, EstadoDispositivo estado) {
        super(id, mac, estado);
    }

    @Override
    public void conectarInternet() {
        estado = EstadoDispositivo.ON_CONECTADO;
        System.out.println("Conectado mediante WPA2");
    }

    @Override
    public boolean pendienteActualizacion() {
        LocalDate hoy = LocalDate.now();
        return fechaActualizacion.plusMonths(1).isBefore(hoy);
    }
}