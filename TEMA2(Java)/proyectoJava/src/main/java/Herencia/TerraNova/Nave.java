package Herencia.TerraNova;

public class Nave {

    private String codigoRegistro;
    private String modelo;
    private int horasVuelo;
    private Comandante comandante;

    public Nave(String codigoRegistro, String modelo, int horasVuelo, Comandante comandante) {
        this.codigoRegistro = codigoRegistro;
        this.modelo = modelo;
        this.horasVuelo = horasVuelo;
        this.comandante = comandante;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nave)) return false;
        Nave n = (Nave) o;
        return this.codigoRegistro.equals(n.codigoRegistro);
    }

    @Override
    public String toString() {
        return "Nave " + codigoRegistro + " - Cmdte: " + comandante;
    }
}

