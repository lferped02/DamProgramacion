package unidad4.Mapas.TraficoYRematriculaciones.Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vehiculo {
    private String vin;
    private String matriculaActual;
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private LocalDate fechaMatriculacion;
    private String propietario;
    private ArrayList<Rematriculacion> historial;

    public Vehiculo(String vin, String matriculaActual, String marca, String modelo, String color, int anio, LocalDate fechaMatriculacion, String propietario) {
        this.vin = vin;
        this.matriculaActual = matriculaActual;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.fechaMatriculacion = fechaMatriculacion;
        this.propietario = propietario;
        this.historial = historial;

        historial = new ArrayList<>();

        // Guardamos la primera matrícula
        historial.add(new Rematriculacion(matricula, fecha));
    }

    public String getVin() {
        return vin;
    }

    public String getMatriculaActual() {
        return matriculaActual;
    }

    public String getPropietario() {
        return propietario;
    }

    public ArrayList<Rematriculacion> getHistorial() {
        return historial;
    }

    public void rematricular(String nuevaMatricula, LocalDate fecha) {
        matriculaActual = nuevaMatricula;
        historial.add(new Rematriculacion(nuevaMatricula, fecha));
    }

    public String toString() {
        return "VIN: " + vin +
                "\nMatricula: " + matriculaActual +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nPropietario: " + propietario;
    }
}