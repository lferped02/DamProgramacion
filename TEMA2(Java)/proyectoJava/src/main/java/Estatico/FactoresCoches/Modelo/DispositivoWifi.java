package Estatico.FactoresCoches.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class DispositivoWifi {

    protected int id;
    protected String mac;
    protected EstadoDispositivo estado;
    protected LocalDate fechaActualizacion;

    public DispositivoWifi(int id, String mac, EstadoDispositivo estado) {
        this.id = id;
        this.mac = mac;
        this.estado = estado;
        this.fechaActualizacion = LocalDate.now();
    }

    public abstract void conectarInternet();

    public abstract boolean pendienteActualizacion();

    public void apagar() {
        estado = EstadoDispositivo.OFF;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DispositivoWifi that = (DispositivoWifi) o;
        return Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mac);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " MAC: " + mac +
                " Estado: " + estado;
    }
}
