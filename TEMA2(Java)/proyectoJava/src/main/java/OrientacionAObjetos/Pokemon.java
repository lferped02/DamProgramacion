package OrientacionAObjetos;

public class Pokemon {
    // Atributos
    String nombre;
    String tipo;
    int nivelVida;
    String nombreEvolucion;

    // Constructor
    public Pokemon(String nombre, String tipo, int nivelVida, String nombreEvolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelVida = nivelVida;
        this.nombreEvolucion = nombreEvolucion;
    }

    // Comportamientos
    public boolean luchar(Pokemon oponente) {
        return this.nivelVida >= oponente.nivelVida;
    }

    public void evolucionar() {
        if (this.nombreEvolucion != null) {
            this.nombre = this.nombreEvolucion;
            this.nivelVida += 20;
        }
    }
}