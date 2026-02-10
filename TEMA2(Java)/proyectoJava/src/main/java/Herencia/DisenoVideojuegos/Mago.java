package Herencia.DisenoVideojuegos;

public class Mago extends Personaje {

    public Mago(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "Hechizo";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        return false;
    }
}

