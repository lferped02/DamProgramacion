package EnumOrientacion.AutoInteligentes;

public class Sensor {
    private double distanciaObstaculo;
    private double velocidad;

    public Sensor(double distancia, double velocidad) {
        this.distanciaObstaculo = distancia;
        this.velocidad = velocidad;
    }

    public boolean alertaObstaculo() {
        return this.distanciaObstaculo < 50;
    }

    public boolean alertaVelocidad() {
        return this.velocidad > 120;
    }

    public void setDistanciaObstaculo(double distancia) {
        this.distanciaObstaculo = distancia;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}