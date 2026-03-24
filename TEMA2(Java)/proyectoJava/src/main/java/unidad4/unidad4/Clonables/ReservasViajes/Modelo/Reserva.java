package unidad4.Clonables.ReservasViajes.Modelo;

public class Reserva {
    private String nombre;
    private String destino;
    private int numeroAsiento;
    private double precioBillete;
    private int id;

    public Reserva(String nombre, String destino, int numeroAsiento, double precioBillete, int id) {
        this.nombre = nombre;
        this.destino = destino;
        this.numeroAsiento = numeroAsiento;
        this.precioBillete = precioBillete;
        this.id = id;
    }
}
