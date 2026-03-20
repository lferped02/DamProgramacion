package unidad4.Ordenaciones.HistorialDeNavegacion.Modelo;

import java.time.LocalDate;

public class PaginaWeb implements Comparable<PaginaWeb> {
    private String url;
    private LocalDate fecha;

    public PaginaWeb(String url, LocalDate fecha) {
        this.url = url;
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(PaginaWeb o) {
        int comp = this.fecha.compareTo(o.fecha);
        if (comp == 0) {
            return this.url.compareToIgnoreCase(o.url);
        }
        return comp;
    }

    @Override
    public String toString() {
        return url + " - " + fecha;
    }
}