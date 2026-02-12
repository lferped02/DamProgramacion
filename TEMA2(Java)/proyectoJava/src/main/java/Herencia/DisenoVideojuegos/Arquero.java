package Herencia.DisenoVideojuegos;

class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, "Flecha");
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        return (atacante instanceof Mago);
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        if (atacante instanceof Mago) return true;
        if (atacante instanceof Caballero && distancia < 50) return true;
        return false;
    }
}
