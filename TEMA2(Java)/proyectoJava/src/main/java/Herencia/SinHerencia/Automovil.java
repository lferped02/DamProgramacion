package Herencia.SinHerencia;

public class Automovil {
    private String dueno;
    private int numeroPuertas;
    private int numeroRuedas;
    private String calificacionEcologica;


    public Automovil(String dueno, int numeroPuertas, int numeroRuedas) {
        this.dueno = dueno;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }

    public void imprimeResumen() {
        System.out.println("Dueño: " + dueno + ", Ruedas: " + numeroRuedas);
    }

    public boolean tieneLicenciaParaCircular(String ciudad) {
        return calificacionEcologica.equals("Eco") || ciudad.equals("Madrid");
    }

}