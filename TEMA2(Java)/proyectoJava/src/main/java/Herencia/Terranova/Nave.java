package Herencia.Terranova;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Objects.equals(codigoRegistro, nave.codigoRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoRegistro);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "codigoRegistro='" + codigoRegistro + '\'' +
                ", modelo='" + modelo + '\'' +
                ", horasVuelo=" + horasVuelo +
                '}';
    }
}
