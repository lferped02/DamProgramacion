package OrientacionAObjetos;

public class Pokemon {
    //Atributos.
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
    //Métodos.
    boolean luchar(Pokemon adversario) {
        return this.nivelVida > adversario.nivelVida;
    }

    void evolucionar() {
        if (nombreEvolucion != null) {
            this.nombre = this.nombreEvolucion;
            this.nivelVida = this.nivelVida + 20;
            System.out.println("¡Ha evolucionado a " + this.nombre + "!");
        }
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivelVida=" + nivelVida +
                ", nombreEvolucion='" + nombreEvolucion + '\'' +
                '}';
    }
}
