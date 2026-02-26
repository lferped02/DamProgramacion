package Estatico.FactoriaDeCoches.Modelo;

public abstract class Robot {
    private static int contadorId = 1;
    protected int id;
    protected String modelo;
    protected int bateria;
    protected String estado;
    protected String combustible;
    protected String descripcion;

    public Robot(String modelo, int bateria, String estado, String combustible, String descripcion) {
        this.id = contadorId++;
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
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", estado='" + estado + '\'' +
                '}';
    }
}