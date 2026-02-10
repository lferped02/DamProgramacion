package Herencia.DisenoVideojuegos;

public class Caballero extends Personaje {

    public Caballero(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "Espada";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        if (atacante instanceof Mago) {
            return true;
        }
        if (atacante instanceof Arquero) {
            return true;
        }
        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        if (atacante instanceof Mago) {
            return true;
        }
        if (atacante instanceof Arquero) {
            return distancia > 100;
        }
        return false;
    }
}

