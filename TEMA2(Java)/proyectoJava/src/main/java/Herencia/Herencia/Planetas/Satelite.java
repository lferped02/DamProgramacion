package Herencia.Planetas;

public class Satelite extends Astro {
    private String planetaAlQuePertenece;

    public Satelite(String nombre, double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia, String planeta) {
        super(nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.planetaAlQuePertenece = planeta;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", diametroMedio=" + diametroMedio +
                '}';
    }

    @Override
    public void muestra() {
        System.out.println("--- Datos del Satélite ---");
        System.out.println("Nombre: " + nombre + " | Pertenece a: " + planetaAlQuePertenece);
        System.out.println("Masa: " + masa + " | Distancia al planeta: " + distanciaMedia);
    }
}