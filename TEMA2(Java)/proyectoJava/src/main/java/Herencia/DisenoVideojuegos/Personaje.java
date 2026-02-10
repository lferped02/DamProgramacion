package Herencia.DisenoVideojuegos;

public abstract class Personaje {

    protected String nombre;
    protected int nivel;
    protected int hp;
    protected String arma;

    public Personaje(String nombre, int nivel, int hp) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
    }

    public abstract String getArma();

    public abstract boolean esAtacado(Personaje atacante);

    public abstract boolean esAtacado(Personaje atacante, int distancia);
}