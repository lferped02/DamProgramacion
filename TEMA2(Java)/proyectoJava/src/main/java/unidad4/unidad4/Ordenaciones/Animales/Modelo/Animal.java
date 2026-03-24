package unidad4.Ordenaciones.Animales.Modelo;

import java.time.LocalDate;

public class Animal implements Comparable<Animal> {
    private int id;
    private String nombre;
    private String especie;
    private int edad;
    private ClasificacionComida tipoComida;
    private LocalDate fechaNacimiento;
    private double peso;
    private Medio medio;
    private ClasificacionGestacion tipoGestacion;

    public Animal(int id, String nombre, String especie, int edad, ClasificacionComida tipoComida, LocalDate fechaNacimiento, double peso, Medio medio, ClasificacionGestacion tipoGestacion) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.tipoComida = tipoComida;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.medio = medio;
        this.tipoGestacion = tipoGestacion;
    }

    public int getId() {
        return id; }

    public String getNombre() {
        return nombre; }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento; }

    public Medio getMedio() {
        return medio; }

    public ClasificacionComida getTipoComida() {
        return tipoComida; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Nacimiento: " + fechaNacimiento +
                " | Medio: " + medio +
                " | Alimentación: " + tipoComida;
    }

    // Comparación natural: nombre → id
    @Override
    public int compareTo(Animal o) {
        int comp = this.nombre.compareToIgnoreCase(o.nombre);
        if (comp == 0) {
            return Integer.compare(this.id, o.id);
        }
        return comp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        return this.id == ((Animal) obj).id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}