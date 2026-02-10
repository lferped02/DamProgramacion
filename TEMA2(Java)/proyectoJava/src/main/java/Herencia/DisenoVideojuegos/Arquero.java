package Herencia.DisenoVideojuegos;

public class Arquero extends Personaje {

    public Arquero(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "Flecha";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        if (atacante instanceof Mago) {
            return true;
        }
        if (atacante instanceof Caballero) {
            return false;
        }
        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        if (atacante instanceof Mago) {
            return true;
        }
        if (atacante instanceof Caballero) {
            return distancia < 50;
        }
        return false;
    }
}

