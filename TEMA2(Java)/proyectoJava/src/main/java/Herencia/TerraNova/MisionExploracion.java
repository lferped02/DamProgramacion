package Herencia.TerraNova;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MisionExploracion extends Mision {

    private String destino;
    private int tripulacion;

    public MisionExploracion(int codigo, String nombreClave, LocalDate fecha, Nave nave, String destino, int tripulacion) {
        super(codigo, nombreClave, fecha, nave);
        this.destino = destino;
        this.tripulacion = tripulacion;
    }

    @Override
    public boolean esMisionRiesgo() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), fechaLanzamiento);
        return destino.equalsIgnoreCase("Marte") || dias <= 7;
    }
}
