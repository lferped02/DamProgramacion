package unidad3.Excepciones.SimuladorDeRed.Excepcion;

import java.time.LocalDateTime;

public class SensorException extends Exception {
    private int sensorId;
    private LocalDateTime ultimaLectura;
    private LocalDateTime lecturaConflictiva;

    public SensorException(String mensaje, int sensorId, LocalDateTime ultima, LocalDateTime conflictiva) {
        super(mensaje);
        this.sensorId = sensorId;
        this.ultimaLectura = ultima;
        this.lecturaConflictiva = conflictiva;
    }

    public SensorException(String mensaje, int sensorId) {
        super(mensaje);
        this.sensorId = sensorId;
    }

    public SensorException(String s) {
    }

    public int getSensorId() {
        return sensorId;
    }

    public LocalDateTime getUltimaLectura() {
        return ultimaLectura;
    }

    public LocalDateTime getLecturaConflictiva() {
        return lecturaConflictiva;
    }
}