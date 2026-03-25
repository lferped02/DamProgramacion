package unidad4.Mapas.ComicFestEspaña.Modelo;

import unidad4.Mapas.ComicFestEspaña.Enums.EstadoEntrada;
import unidad4.Mapas.ComicFestEspaña.Enums.TipoEntrada;

import java.time.LocalDate;

public class EntradaVip {
    private String codigoEntrada;
    private LocalDate fechaEntrada;
    private TipoEntrada tipo;
    private EstadoEntrada estado;

    public EntradaVip(String codigoEntrada, LocalDate fechaEntrada, TipoEntrada tipo, EstadoEntrada estado) {
        this.codigoEntrada = codigoEntrada;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EntradaVip{" +
                "codigoEntrada='" + codigoEntrada + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", tipo=" + tipo +
                ", estado=" + estado +
                '}';
    }
}