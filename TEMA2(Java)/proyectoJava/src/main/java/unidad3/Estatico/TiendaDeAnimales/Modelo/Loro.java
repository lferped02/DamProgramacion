package Estatico.TiendaDeAnimales.Modelo;

import java.time.LocalDate;

public class Loro extends Ave{
    protected String origen;
    protected boolean habla;

    public Loro(String nombre, int edad, LocalDate fechaNacimiento, String origen, boolean habla) {
        super(nombre, edad, fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public boolean volar() {
        return true;
    }

    @Override
    public boolean habla() {
        return true;
    }

    @Override
    public String toString() {
        return "Loro{" +
                "origen='" + origen + '\'' +
                ", habla=" + habla +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", fechaNacimiento=" + getFechaNacimiento() +
                '}';
    }
}
