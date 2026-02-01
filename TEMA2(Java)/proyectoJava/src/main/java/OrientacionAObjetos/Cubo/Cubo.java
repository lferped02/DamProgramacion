package OrientacionAObjetos.Cubo;

public class Cubo {
    private double lado;
    private double contenidoActual;

    public Cubo(double lado) {
        this.lado = lado;
        this.contenidoActual = 0;
    }

    public double calcularArea() {
        return 6 * (lado * lado);
    }

    public double calcularVolumen() {
        return lado * lado * lado;
    }

    public boolean rellenar(double litros) {
        if (litros > 0 && (contenidoActual + litros <= calcularVolumen())) {
            contenidoActual = contenidoActual + litros;
            return true;
        }
        return false;
    }

    public boolean vaciar(double litros) {
        if (litros > 0 && (contenidoActual - litros >= 0)) {
            contenidoActual = contenidoActual - litros;
            return true;
        }
        return false;
    }

    public double getContenidoActual() {
        return contenidoActual;
    }
}