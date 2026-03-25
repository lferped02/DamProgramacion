package unidad4.Clonables.ReservasViajes.Modelo;

import java.util.Objects;

public class Reserva implements Cloneable {
    private static int contador = 1;
    private int id;
    private String pasajero;
    private String destino;
    private String asiento;
    private double precio;

    public Reserva(String pasajero, String destino, String asiento, double precio) {
        this.id = contador++;
        this.pasajero = pasajero;
        this.destino = destino;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getPasajero() { return pasajero; }
    public String getDestino() { return destino; }
    public String getAsiento() { return asiento; }
    public double getPrecio() { return precio; }

    public void setAsiento(String asiento) { this.asiento = asiento; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public Reserva clone() {
        try {
            return (Reserva) super.clone(); // copia superficial (suficiente aquí)
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar", e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva)) return false;
        Reserva reserva = (Reserva) o;
        return id == reserva.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", pasajero='" + pasajero + '\'' +
                ", destino='" + destino + '\'' +
                ", asiento='" + asiento + '\'' +
                ", precio=" + precio +
                '}';
    }
}
