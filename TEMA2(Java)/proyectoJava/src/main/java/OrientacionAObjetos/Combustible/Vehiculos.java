package OrientacionAObjetos.Combustible;

 class Vehiculos {
     String marca;
     String modelo;
     int anio;
     String tipoCombustible;
     double capacidadTanque;
     double consumoMedio;
     double nivelActual;

     Vehiculos(String marca, String modelo, int anio, String tipoCombustible,
                     double capacidadTanque, double consumoMedio, double nivelActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoCombustible = tipoCombustible;
        this.capacidadTanque = capacidadTanque;
        this.consumoMedio = consumoMedio;
        this.nivelActual = nivelActual;
    }

     double calcularConsumo(double kilometros) {
        return (kilometros * consumoMedio) / 100;
    }

     boolean necesitaRepostar() {
        double limiteReserva = capacidadTanque * 0.20;
        return nivelActual < limiteReserva;
    }

     String getDetalles() {
        return marca + " " + modelo + " (" + anio + ")";
    }
}
