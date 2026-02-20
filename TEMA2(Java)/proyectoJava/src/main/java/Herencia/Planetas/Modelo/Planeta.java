package Herencia.Planetas.Modelo;

public class Planeta extends Astro {
    private Satelite[] satelites;
    private int contadorSatelites;

    public Planeta(String nombre, double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        super(nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new Satelite[10];
        this.contadorSatelites = 0;
    }

    public void agregarSatelite(Satelite satelite) {
        if (contadorSatelites < satelites.length) {
            satelites[contadorSatelites] = satelite;
            contadorSatelites++;
        }
    }

    @Override
    public String toString() {
        return "Planeta: " + nombre + ", Masa: " + masa + ", Diámetro: " + diametroMedio;
    }

    @Override
    public void muestraInformacion() {

    }

    public void muestra() {
        System.out.println("--- DATOS DEL PLANETA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Diámetro: " + diametroMedio);
        System.out.println("Distancia al Sol: " + distanciaMedia);

        if (contadorSatelites > 0) {
            System.out.print("Satélites: ");
            for (int i = 0; i < contadorSatelites; i++) {
                System.out.print(satelites[i].getNombre() + " ");
            }
            System.out.println();
        } else {
            System.out.println("No tiene satélites.");
        }
    }
}