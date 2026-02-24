package Estatico.FactoresCoches.Modelo;

import java.time.LocalDate;

public class SensorTemperatura extends DispositivoWifi {
    private double temperatura;

    public SensorTemperatura(int id, String mac, EstadoDispositivo estado, double temperatura) {
        super(id, mac, estado);
        this.temperatura = temperatura;
    }

    @Override
    public void conectarInternet() {
        estado = EstadoDispositivo.ON_CONECTADO;
        System.out.println("Conectado mediante WPA");
    }

    @Override
    public boolean pendienteActualizacion() {
        LocalDate hoy = LocalDate.now();
        return fechaActualizacion.plusMonths(3).isBefore(hoy);
    }

    @Override
    public String toString() {
        return super.toString() + " Temperatura: " + temperatura;
    }
}