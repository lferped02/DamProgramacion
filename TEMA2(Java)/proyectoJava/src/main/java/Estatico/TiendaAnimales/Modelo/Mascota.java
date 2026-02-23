package Estatico.TiendaAnimales.Modelo;

public abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;
    protected double peso; // Necesario para calcular el más pesado

    public Mascota(String nombre, int edad, String estado, String fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public abstract void muestra();
    public abstract boolean habla();

    public void cumpleaños() { this.edad++; }
    public void morir() { this.estado = "Fallecido"; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " (" + this.getClass().getSimpleName() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mascota m = (Mascota) obj;
        return edad == m.edad && nombre.equals(m.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }
}
