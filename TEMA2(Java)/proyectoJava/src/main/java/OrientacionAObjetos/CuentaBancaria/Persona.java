package OrientacionAObjetos.CuentaBancaria;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    public String dni;
    public String nombre;
    public String apellidos;
    public LocalDate fechaNacimiento;

    public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esMayorDeEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    public String getDni() {
        return dni; }
}
