package unidad4.Clonables.ReservasViajes.Repositorio;

import unidad4.Clonables.ReservasViajes.Modelo.Reserva;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepositorioReservas {

    private Set<Reserva> reservas = new LinkedHashSet<>();

    public void anadirReserva(Reserva r) {
        reservas.add(r);
    }

    public Reserva obtenerReserva(int id) {
        for (Reserva r : reservas) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    public void mostrarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public Reserva cambiarAsiento(int id, String nuevoAsiento, boolean confirmar) {
        for (Reserva r : reservas) {
            if (r.getId() == id) {

                if (confirmar) {
                    r.setAsiento(nuevoAsiento);
                    return r;
                } else {
                    Reserva copia = r.clone();
                    copia.setAsiento(nuevoAsiento);
                    return copia;
                }
            }
        }
        return null;
    }
}