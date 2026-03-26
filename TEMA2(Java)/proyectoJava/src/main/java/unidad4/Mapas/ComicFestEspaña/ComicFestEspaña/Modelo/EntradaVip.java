package unidad4.Mapas.ComicFestEspaña.Modelo;

import unidad4.Mapas.ComicFestEspaña.Enums.EstadoEntrada;
import unidad4.Mapas.ComicFestEspaña.Enums.TipoEntrada;

public class EntradaVip {
    private String codigo;
    private String fecha;
    private TipoEntrada tipo;
    private EstadoEntrada estado;

    public EntradaVip(String codigo, String fecha, TipoEntrada tipo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipo = tipo;
        this.estado = EstadoEntrada.ENVIADA;
    }

    public void confirmar() {
        estado = EstadoEntrada.CONFIRMADA;
    }

    public void cancelar() {
        estado = EstadoEntrada.CANCELADA;
    }

    public EstadoEntrada getEstado() {
        return estado;
    }

    public TipoEntrada getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Tipo: " + tipo + " | Estado: " + estado;
    }
}
