package unidad3.Excepciones.SimuladorDeRed.Modelo;

import java.time.LocalDateTime;

public class Lectura {

    private LocalDateTime timestamp;
    private double valor;
    private boolean anomala;

    public Lectura(LocalDateTime timestamp, double valor, boolean anomala) {
        this.timestamp = timestamp;
        this.valor = valor;
        this.anomala = anomala;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getValor() {
        return valor;
    }

    public boolean isAnomala() {
        return anomala;
    }
}