package Herencia.TerraNova;

import java.time.LocalDate;

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
        boolean destinoMarte = destino.equalsIgnoreCase("Marte");
        boolean fechaProxima = fechaLanzamiento.isBefore(LocalDate.now().plusDays(7));
        return destinoMarte || fechaProxima;
    }

    @Override
    public String toString() {
        return "[Exploración] " + super.toString();
    }
}
