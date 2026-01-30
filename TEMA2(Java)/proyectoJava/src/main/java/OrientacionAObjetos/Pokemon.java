package OrientacionAObjetos;

public class Pokemon {
    String nombre;
    String tipo;
    int nivelVida;
    Pokemon evolucion;

    public Pokemon(String nombre, String tipo, int nivelVida, Pokemon evolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelVida = nivelVida;
        this.evolucion = evolucion;
    }

    public boolean luchar(Pokemon oponente) {
        return this.nivelVida >= oponente.nivelVida;
    }

    public void evolucionar() {
        if (this.evolucion != null) {
            System.out.println("¡" + this.nombre + " está evolucionando!");
            this.nombre = this.evolucion.nombre;
            this.tipo = this.evolucion.tipo;
            this.nivelVida = this.evolucion.nivelVida;
            this.evolucion = this.evolucion.evolucion;
        } else {
            System.out.println(this.nombre + " no tiene más evoluciones.");
        }
    }

    @Override
    public String toString() {
        String infoEvolucion = (evolucion != null) ? evolucion.nombre : "Ninguna";
        return "Pokemon [" +
                "Nombre: " + nombre +
                " | Tipo: " + tipo +
                " | Vida: " + nivelVida +
                " | Siguiente Evolución: " + infoEvolucion +
                "]";
    }
}