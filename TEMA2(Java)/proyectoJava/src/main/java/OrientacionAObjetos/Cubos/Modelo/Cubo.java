package OrientacionAObjetos.Cubos.Modelo;

 public class Cubo {
     double lado;
     double contenidoActual;

     public Cubo(double lado) {
        this.lado = lado;
        this.contenidoActual = 0;
    }

     public double calcularArea() {

         return 6 * (lado * lado);
    }

     public double calcularVolumenCm3() {

         return (lado * lado * lado) * 1000;
    }

     public double capacidadMaxima() {

         return lado * lado * lado;
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
        return "Cubo{" +
                "lado=" + lado +
                ", contenidoActual=" + contenidoActual +
                '}';
    }
}