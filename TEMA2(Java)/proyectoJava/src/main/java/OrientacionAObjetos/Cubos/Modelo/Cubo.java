package OrientacionAObjetos.Cubos.Modelo;

 class Cubo {
     double lado;
     double contenidoActual;

     Cubo(double lado) {
        this.lado = lado;
        this.contenidoActual = 0;
    }

     double calcularArea() {

         return 6 * (lado * lado);
    }

     double calcularVolumenCm3() {

         return (lado * lado * lado) * 1000;
    }

     double capacidadMaxima() {

         return lado * lado * lado;
    }

     boolean rellenar(double litros) {
        if (this.contenidoActual + litros <= capacidadMaxima()) {
            this.contenidoActual += litros;
            return true;
        }
        return false;
    }

     boolean vaciar(double litros) {
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