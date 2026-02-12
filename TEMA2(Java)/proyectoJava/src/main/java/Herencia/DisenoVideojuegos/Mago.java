package Herencia.DisenoVideojuegos;

class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre, "Hechizo");
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

