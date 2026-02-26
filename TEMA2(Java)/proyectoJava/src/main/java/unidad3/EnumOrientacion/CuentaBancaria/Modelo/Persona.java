package EnumOrientacion.CuentaBancaria.Modelo;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int fechaNacimiento;

    public Persona(String dni, String nombre, String apellidos, int fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esMayorDeEdad() {
        int anioActual = 2026;
        return (anioActual - this.fechaNacimiento) >= 18;
    }

    public String getDni() {

        return dni;
    }
}
