package OrientacionAObjetos.Cubos;

public class Cubo {
    private double lado;
    private double contenidoActual;

    public Cubo(double lado) {
        this.lado = lado;
        this.contenidoActual = 0;
    }

    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    public double calcularVolumenCm3() {
        return Math.pow(lado, 3) * 1000;
    }

    public double capacidadMaxima() {
        return Math.pow(lado, 3);
    }

    public boolean rellenar(double litros) {
        if (this.contenidoActual + litros <= capacidadMaxima()) {
            this.contenidoActual += litros;
            return true;
        }
        return false;
    }

    public boolean vaciar(double litros) {
        if (this.contenidoActual - litros >= 0) {
            this.contenidoActual -= litros;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cubo [Lado: " + lado + " dm, Contenido: " + contenidoActual + " L]";
    }
}