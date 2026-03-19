package unidad4.Ordenaciones.Animales.Modelo;

import java.time.LocalDate;

public class Animal {
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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ClasificacionComida getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(ClasificacionComida tipoComida) {
        this.tipoComida = tipoComida;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public ClasificacionGestacion getTipoGestacion() {
        return tipoGestacion;
    }

    public void setTipoGestacion(ClasificacionGestacion tipoGestacion) {
        this.tipoGestacion = tipoGestacion;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Especie: " + especie +
                " | Edad: " + edad +
                " | Comida: " + tipoComida +
                " | Nacimiento: " + fechaNacimiento +
                " | Peso: " + peso +
                " | Medio: " + medio +
                " | Gestación: " + tipoGestacion;
    }
}