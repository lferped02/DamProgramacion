package unidad3.Excepciones.SimuladorDeRed.Excepcion;

public class FalloCriticoException extends RuntimeException {
    public FalloCriticoException(String mensaje) {
        super(mensaje);
    }
}