package unidad4.Ordenaciones.HistorialDeNavegacion.Repositorio;

import unidad4.Ordenaciones.HistorialDeNavegacion.Excepciones.HistorialException;
import unidad4.Ordenaciones.HistorialDeNavegacion.Modelo.PaginaWeb;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Historial {
    private Set<PaginaWeb> historial;

    public Historial() {
        historial = new TreeSet<>();
    }

    public void agregarPagina(String url, LocalDate fecha) throws HistorialException {
        if (fecha == null) {
            fecha = LocalDate.now();
        }

        if (fecha.isAfter(LocalDate.now())) {
            throw new HistorialException("Fecha futura no permitida");
        }

        historial.add(new PaginaWeb(url, fecha));
    }

    public void mostrarHistorial() {
        for (PaginaWeb p : historial) {
            System.out.println(p);
        }
    }

    public void consultarPorFecha(LocalDate fecha) {
        for (PaginaWeb p : historial) {
            if (p.getFecha().equals(fecha)) {
                System.out.println(p);
            }
        }
    }

    public void consultarPorUrl(String url) {
        for (PaginaWeb p : historial) {
            if (p.getUrl().equalsIgnoreCase(url)) {
                System.out.println(p);
            }
        }
    }

    public void borrarPorUrl(String url) {
        historial.removeIf(p -> p.getUrl().equalsIgnoreCase(url));
    }

    public Set<PaginaWeb> getHistorial() {
        return historial;
    }
}