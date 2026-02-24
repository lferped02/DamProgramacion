package Estatico.TiendaDeAnimales.Modelo;

import java.time.LocalDate;

public class Gato extends Mascotas {
    protected String color;
    protected boolean peloLargo;

    public Gato(String nombre, int edad, LocalDate fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", peloLargo=" + peloLargo +
                '}';
    }

    @Override
    public boolean habla() {
        return false;
    }
}
