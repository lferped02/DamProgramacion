package Estatico.TiendaAnimales.Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascota {
    public String nombre;
    public int edad;
    public String estado;
    public LocalDate fechaNacimiento;

    public Mascota(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters & Setters
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return edad == mascota.edad && Objects.equals(nombre, mascota.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", estado='" + getEstado() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                '}';
    }
    abstract void muestra();

    public void cumpleanio(){
    }

    abstract boolean habla();
}