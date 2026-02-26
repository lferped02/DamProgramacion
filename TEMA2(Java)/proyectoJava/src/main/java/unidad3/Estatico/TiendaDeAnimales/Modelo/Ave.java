package Estatico.TiendaDeAnimales.Modelo;

import java.time.LocalDate;

public abstract class Ave extends Mascotas {
    protected String pico;
    protected boolean vuela;

    public Ave(String nombre, int edad, LocalDate fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public abstract boolean volar();
}
