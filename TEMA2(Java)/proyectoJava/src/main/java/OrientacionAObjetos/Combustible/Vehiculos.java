package OrientacionAObjetos.Combustible;

public class Vehiculos {
    public String marca;
    public String modelo;
    public int anio;
    public String tipoCombustible;
    public double capacidadTanque;
    public double consumoMedio;
    public double nivelActual;

    public Vehiculos(String marca, String modelo, int anio, String tipoCombustible,
                    double capacidadTanque, double consumoMedio, double nivelActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoCombustible = tipoCombustible;
        this.capacidadTanque = capacidadTanque;
        this.consumoMedio = consumoMedio;
        this.nivelActual = nivelActual;
    }

    public double calcularConsumo(double kilometros) {
        return (kilometros * consumoMedio) / 100;
    }

    public boolean necesitaRepostar() {
        double limiteReserva = capacidadTanque * 0.20;
        return nivelActual < limiteReserva;
    }

    public String getDetalles() {
        return marca + " " + modelo + " (" + anio + ")";
    }
}
