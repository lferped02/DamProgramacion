package Herencia.DisenoVideojuegos;

public class GestionaJuego {
    public static void main(String[] args) {
        Villano villano = new Villano("Dark Lord");
        Caballero caballero = new Caballero("Arthur");
        Arquero arquero = new Arquero("Legolas");
        Mago mago = new Mago("Gandalf");

        Personaje[] personajes = {villano, caballero, arquero, mago};

        System.out.println("--- REPORTE DE ARMAS ---");
        for (Personaje p : personajes) {
            System.out.println(p.getNombre() + " usa: [" + p.getArma() + "]");
        }

        System.out.println("\n--- PRUEBAS DE COMBATE ---");
        System.out.println("¿Mago ataca a Caballero?: " + caballero.esAtacado(mago));

        System.out.println("¿Caballero ataca a Arquero (sin distancia)?: " + arquero.esAtacado(caballero));
        System.out.println("¿Caballero ataca a Arquero (a 30mts)?: " + arquero.esAtacado(caballero, 30));

        System.out.println("¿Arquero ataca a Caballero (a 150mts)?: " + caballero.esAtacado(arquero, 150));

        System.out.println("¿Arquero ataca a Villano?: " + villano.esAtacado(arquero));

        System.out.println("¿Caballero ataca a Mago?: " + mago.esAtacado(caballero));
    }
}