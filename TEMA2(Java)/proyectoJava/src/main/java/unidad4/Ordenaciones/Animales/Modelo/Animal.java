package unidad4.Ordenaciones.Animales.Modelo;

import java.time.LocalDate;

public class Animal implements Comparable<Animal> {
    private int id;
    private String nombre;
    private String especie;
    private int edad;
    private String clasificacionComida;
    private LocalDate fechaNacimiento;
    private double peso;
    private String medio;
    private String clasificacionGestacion;

    public Animal(int id, String nombre, String especie, int edad, String clasificacionComida,
                  LocalDate fechaNacimiento, double peso, String medio, String clasificacionGestacion) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.clasificacionComida = clasificacionComida;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.medio = medio;
        this.clasificacionGestacion = clasificacionGestacion;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getMedio() { return medio; }
    public String getClasificacionComida() { return clasificacionComida; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public int compareTo(Animal other) {
        int cmp = this.nombre.compareToIgnoreCase(other.nombre);
        if(cmp != 0) return cmp;
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", medio='" + medio + '\'' +
                ", clasificacionComida='" + clasificacionComida + '\'' +
                '}';
    }
}