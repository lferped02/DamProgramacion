package Herencia.DisenoVideojuegos;

class Villano extends Personaje {
    public Villano(String nombre) {
        super(nombre, "");
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
