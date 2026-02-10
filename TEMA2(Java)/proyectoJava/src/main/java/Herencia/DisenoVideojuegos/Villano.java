package Herencia.DisenoVideojuegos;

public class Villano extends Personaje {

    public Villano(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        return true;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        return true;
    }
}
