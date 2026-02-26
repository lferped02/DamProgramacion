package Estatico.TiendaDeAnimales.Modelo;

import java.time.LocalDate;

public class Canario extends Ave{
    protected String color;
    protected boolean canta;

    public Canario(String nombre, int edad, LocalDate fechaNacimiento, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public boolean volar() {
        return false;
    }

    @Override
    public boolean habla() {
        return false;
    }
}
