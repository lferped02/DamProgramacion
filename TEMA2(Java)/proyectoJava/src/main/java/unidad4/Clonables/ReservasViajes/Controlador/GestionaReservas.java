package unidad4.Clonables.ReservasViajes.Controlador;

import unidad4.Clonables.ReservasViajes.Modelo.Reserva;
import unidad4.Clonables.ReservasViajes.Repositorio.RepositorioReservas;

public class GestionaReservas {
    public static void main(String[] args) {
        RepositorioReservas repo = new RepositorioReservas();
        Reserva reserva1 = new Reserva("Carlo Romero", "Venecia", "2B", 225);
        Reserva reserva2 = new Reserva("Mateo Nuñez", "Milán", "5A", 150);

        repo.anadirReserva(reserva1);
        repo.anadirReserva(reserva2);
        Reserva reservaPrevia = repo.obtenerReserva(1);

        System.out.println("===Reservas iniciales.===");
        repo.mostrarReservas();
        reservaPrevia.setAsiento("3B");
        reservaPrevia.setAsiento("1C");

        System.out.println("===Después de modificar reserva previa.===");
        System.out.println("Repositorio: ");
        repo.mostrarReservas();

        System.out.println("Reserva previa: ");
        System.out.println(reservaPrevia);

        System.out.println("===Simulación cambio asiento.===");
        Reserva simulacion = repo.cambiarAsiento(2, "5C", false);
        System.out.println("La simulacion es: "+ simulacion);

        System.out.println("===Confirmar cambio de asiento===");
        repo.cambiarAsiento(2, "4A", true);

        System.out.println("Repositorio tras confirmación: ");
        repo.mostrarReservas();
    }
}