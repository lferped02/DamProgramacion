package Estatico.TiendaDeAnimales.Modelo;

import java.time.LocalDate;

public class  Perro extends Mascotas {
    protected  String raza;
    protected boolean tienePulga;

    public Perro(String nombre, int edad, LocalDate fechaNacimiento, String raza, boolean tienePulga) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.tienePulga = tienePulga;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isTienePulga() {
        return tienePulga;
    }

    public void setTienePulga(boolean tienePulga) {
        this.tienePulga = tienePulga;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + getRaza() + '\'' +
                ", tienePulga=" + isTienePulga() +
                '}';
    }

    @Override
    public boolean habla() {
        return false;
    }
}