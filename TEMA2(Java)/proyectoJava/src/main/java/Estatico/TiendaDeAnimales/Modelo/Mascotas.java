package Estatico.TiendaDeAnimales.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascotas {
    protected String nombre;
    protected int edad;
    protected String estado;
    protected LocalDate fechaNacimiento;

    public Mascotas(String nombre, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mascotas mascota = (Mascotas) o;
        return edad == mascota.edad && Objects.equals(nombre, mascota.nombre) && Objects.equals(fechaNacimiento, mascota.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                this.getClass().getName()+
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public abstract boolean habla();
}
