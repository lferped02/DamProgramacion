package unidad4.Ordenaciones.HistorialDeNavegacion.Repositorio;

import unidad4.Ordenaciones.HistorialDeNavegacion.Excepciones.HistorialException;
import unidad4.Ordenaciones.HistorialDeNavegacion.Modelo.PaginaWeb;

import java.time.LocalDate;
import java.util.HashSet;
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
        if (historial.isEmpty()) {
            System.out.println("Historial vacío.");
            return;
        }

        for (PaginaWeb p : historial) {
            System.out.println(p);
        }
    }

    public void consultarPorFecha(LocalDate fecha) {
        boolean encontrado = false;

        for (PaginaWeb p : historial) {
            if (p.getFecha().equals(fecha)) {
                System.out.println(p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay registros en esa fecha.");
        }
    }

    public void consultarPorUrl(String url) {
        boolean encontrado = false;

        for (PaginaWeb p : historial) {
            if (p.getUrl().equalsIgnoreCase(url)) {
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay registros para esa URL.");
        }
    }

    public void borrarPorUrl(String url) {
        Set<PaginaWeb> paginasBorrar = new HashSet<>();
        for (PaginaWeb p : historial) {
            if (p.getUrl().equalsIgnoreCase(url)) {
                paginasBorrar.add(p);
            }
        }

        if (paginasBorrar.isEmpty()) {
            System.out.println("No hay páginas para borrar.");
        } else {
            historial.removeAll(paginasBorrar);
            System.out.println("Páginas eliminadas correctamente.");
        }
    }

    public Set<PaginaWeb> getHistorial() {
        return historial;
    }
}