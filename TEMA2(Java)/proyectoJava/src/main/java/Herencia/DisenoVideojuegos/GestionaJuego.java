package Herencia.DisenoVideojuegos;

public class GestionaJuego {

    public static void main(String[] args) {

        Personaje villano = new Villano("Malefica", 5, 100);
        Personaje caballero = new Caballero("Arthur", 10, 150);
        Personaje arquero = new Arquero("Legolas", 8, 120);
        Personaje mago = new Mago("Merlin", 12, 80);

        System.out.println("ARMAS:");
        System.out.println("Villano: " + villano.getArma());
        System.out.println("Caballero: " + caballero.getArma());
        System.out.println("Arquero: " + arquero.getArma());
        System.out.println("Mago: " + mago.getArma());

        System.out.println("\nATAQUES SIN DISTANCIA:");
        System.out.println("Arquero atacado por Caballero: " + arquero.esAtacado(caballero));
        System.out.println("Caballero atacado por Arquero: " + caballero.esAtacado(arquero));
        System.out.println("Mago atacado por Villano: " + mago.esAtacado(villano));
        System.out.println("Villano atacado por Mago: " + villano.esAtacado(mago));

        System.out.println("\nATAQUES CON DISTANCIA:");
        System.out.println("Arquero atacado por Caballero (30m): " + arquero.esAtacado(caballero, 30));
        System.out.println("Arquero atacado por Caballero (60m): " + arquero.esAtacado(caballero, 60));
        System.out.println("Caballero atacado por Arquero (150m): " + caballero.esAtacado(arquero, 150));
        System.out.println("Caballero atacado por Arquero (50m): " + caballero.esAtacado(arquero, 50));
    }
}
