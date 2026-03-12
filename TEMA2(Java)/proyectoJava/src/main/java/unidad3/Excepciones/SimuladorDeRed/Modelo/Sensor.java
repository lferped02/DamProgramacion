package unidad3.Excepciones.SimuladorDeRed.Modelo;

import unidad3.Excepciones.SimuladorDeRed.Excepcion.SensorException;
import java.time.LocalDateTime;

public class Sensor {
    private static int contadorId = 1;

    private int id;
    private TipoParametro tipo;
    private double minimo;
    private double maximo;

    private Lectura[] historial = new Lectura[100];
    private int totalLecturas = 0;

    public Sensor(TipoParametro tipo, double minimo, double maximo) {
        this.id = contadorId++;
        this.tipo = tipo;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public int getId() {
        return id;
    }

    public TipoParametro getTipo() {
        return tipo;
    }

    public Lectura[] getHistorial() {
        return historial;
    }

    public int getTotalLecturas() {
        return totalLecturas;
    }

    public void registrarLectura(double valor, LocalDateTime timestamp) throws SensorException {

        if (!validarFechaYhora(timestamp)) {
            throw new SensorException("La fecha es anterior a la última lectura");
        }

        boolean anomala = false;
        if (valor < minimo || valor > maximo) {
            anomala = true;
        }
        historial[totalLecturas] = new Lectura(timestamp, valor, anomala);
        totalLecturas++;
    }
    private boolean validarFechaYhora(LocalDateTime timestamp) {

        if (totalLecturas == 0) {
            return true;
        }
        LocalDateTime ultimaFecha = historial[totalLecturas - 1].getTimestamp();
        return !timestamp.isBefore(ultimaFecha);
    }
}