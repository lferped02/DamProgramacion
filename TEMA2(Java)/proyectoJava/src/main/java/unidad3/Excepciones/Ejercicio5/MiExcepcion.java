package unidad3.Excepciones.Ejercicio5;

public class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }

    @Override
    public String toString() {
        return "MiExcepcion: " + getMessage();
    }
}
