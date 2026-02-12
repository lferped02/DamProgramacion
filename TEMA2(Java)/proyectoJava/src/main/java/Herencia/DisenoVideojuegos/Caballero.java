package Herencia.DisenoVideojuegos;

class Caballero extends Personaje {
    public Caballero(String nombre) {
        super(nombre, "Espada");
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        return (atacante instanceof Arquero || atacante instanceof Mago);
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        if (atacante instanceof Mago)
            return true;
        if (atacante instanceof Arquero && distancia > 100)
            return true;
        return false;
    }
}

