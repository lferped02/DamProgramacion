package Herencia.TerraNova;

public class Nave {

    private String codigoRegistro;
    private String modelo;
    private int horasVuelo;

    public Nave(String codigoRegistro, String modelo, int horasVuelo) {
        this.codigoRegistro = codigoRegistro;
        this.modelo = modelo;
        this.horasVuelo = horasVuelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Nave) {
            Nave otra = (Nave) obj;
            return this.codigoRegistro.equals(otra.codigoRegistro);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nave " + codigoRegistro;
    }
}
