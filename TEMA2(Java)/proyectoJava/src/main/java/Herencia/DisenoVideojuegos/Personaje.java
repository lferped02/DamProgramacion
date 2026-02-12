package Herencia.DisenoVideojuegos;

public class Personaje {
    private String nombre;
    private int nivel;
    private int hp;
    private String arma;

    public Personaje(String nombre, String arma) {
        this.nombre = nombre;
        this.arma = arma;
        this.nivel = 1;
        this.hp = 100;
    }

    public String getArma() {
        return this.arma;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esAtacado(Personaje atacante) {
        return false;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        return false;
    }
}