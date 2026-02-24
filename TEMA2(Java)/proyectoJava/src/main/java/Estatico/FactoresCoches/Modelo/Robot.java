package Estatico.FactoresCoches.Modelo;

import java.util.Objects;


public abstract class Robot {
    private static int contador = 1;
    protected int id;
    protected String modelo;
    protected int bateria;
    protected EstadoRobot estado;
    protected String combustible;
    protected String descripcion;

    public Robot(String modelo, int bateria, EstadoRobot estado, String combustible, String descripcion) {
        this.id = contador++;
        this.modelo = modelo;
        this.bateria = bateria;
        this.estado = estado;
        this.combustible = combustible;
        this.descripcion = descripcion;
    }

    public boolean tieneBateriaSuficiente() {
        return bateria > 10;
    }

    public abstract String ejecutarTarea();
    public abstract boolean recargar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Robot)) return false;
        Robot robot = (Robot) o;
        return id == robot.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " Modelo: " + modelo +
                " Estado: " + estado +
                " Batería: " + bateria;
    }
}