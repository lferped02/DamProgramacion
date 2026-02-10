package EnumOrientacion.AutoInteligentes;

public class Conductor {
    private String nombre;
    private int aniosExperiencia;

    public Conductor(String nombre, int aniosExperiencia) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void conducir() {
        System.out.println(this.nombre + " conduciendo");
    }

    public String getNombre() {
        return nombre;
    }
}