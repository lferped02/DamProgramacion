package Herencia.Planetas;

public class Planeta extends Astro {
    private Satelite[] satelites;
    private int contadorSatelites;

    public Planeta(String nombre, double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        super(nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new Satelite[100];
        this.contadorSatelites = 0;
    }

    public void agregarSatelite(Satelite s) {
        if (contadorSatelites < satelites.length) {
            satelites[contadorSatelites] = s;
            contadorSatelites++;
        } else {
            System.out.println("Error: No se pueden agregar más satélites a este planeta.");
        }
    }

    public Satelite[] getSatelites() {
        return satelites;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + getNombre() + '\'' +
                ", masa=" + masa +
                ", diametroMedio=" + diametroMedio +
                '}';
    }

    @Override
    public void muestra() {
        System.out.println("--- Datos del Planeta ---");
        System.out.println("Nombre: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametroMedio);
        System.out.println("Rotación: " + periodoRotacion + "h | Traslación: " + periodoTraslacion + "h");

        if (contadorSatelites == 0) {
            System.out.println("No tiene satélites conocidos.");
        } else {
            System.out.print("Satélites conocidos: ");
            for (int i = 0; i < contadorSatelites; i++) {
                System.out.print(satelites[i].getNombre() + (i == contadorSatelites - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }
}