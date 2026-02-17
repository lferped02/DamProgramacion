package Herencia.Planetas;

import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {
    private List<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        super(nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new ArrayList<>();
    }

    public void agregarSatelite(Satelite s) {
        satelites.add(s);
    }

    public List<Satelite> getSatelites() {
        return satelites;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", diametroMedio=" + diametroMedio +
                '}';
    }

    @Override
    public void muestra() {
        System.out.println("--- Datos del Planeta ---");
        System.out.println("Nombre: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametroMedio);
        System.out.println("Rotación: " + periodoRotacion + "h | Traslación: " + periodoTraslacion + "h");
        if (!satelites.isEmpty()) {
            System.out.print("Satélites conocidos: ");
            for (Satelite s : satelites) System.out.print(s.getNombre() + " ");
            System.out.println();
        }
    }
}
