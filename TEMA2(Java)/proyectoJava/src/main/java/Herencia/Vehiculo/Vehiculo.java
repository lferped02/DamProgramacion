package Herencia.Vehiculo;

public class Vehiculo {
    protected String dueno;
    protected int numerosRuedas;
    protected String calificacionEcologica;

    public Vehiculo(String dueno, int numerosRuedas, String calificacionEcologica) {
        this.dueno = dueno;
        this.numerosRuedas = numerosRuedas;
        this.calificacionEcologica = calificacionEcologica;
    }

    public boolean tieneLimitacionParaCircular(String ciudad) {
        if (ciudad.equalsIgnoreCase("Madrid") || ciudad.equalsIgnoreCase("Barcelona")) {
            return calificacionEcologica.equals("B") || calificacionEcologica.equals("C");
        }
        if (ciudad.equalsIgnoreCase("Valencia") || ciudad.equalsIgnoreCase("Sevilla")) {
            return calificacionEcologica.equals("C");
        }
        return false;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getNumerosRuedas() {
        return numerosRuedas;
    }

    public void setNumerosRuedas(int numerosRuedas) {
        this.numerosRuedas = numerosRuedas;
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }
}
