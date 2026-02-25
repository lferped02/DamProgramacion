package Interfaces.CadenaAlimenticiaBosque.Modelo;

abstract class Animal {

    protected String especie;
    protected String familia;
    protected String habitat;

    protected Animal[] come = new Animal[10];
    protected Animal[] esComidoPor = new Animal[10];

    protected int numeroCome = 0;
    protected int numeroEsComido = 0;

    public Animal(String especie, String familia, String habitat) {
        this.especie = especie;
        this.familia = familia;
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public String getFamilia() {
        return familia;
    }

    public void addCome(Animal a) {
        if (numeroCome < 10) {
            come[numeroCome++] = a;
        }
    }

    public void addEsComidoPor(Animal a) {
        if (numeroEsComido < 10) {
            esComidoPor[numeroEsComido++] = a;
        }
    }

    public boolean atacar(Animal a) {
        if (this.especie.equals(a.especie)) return false;

        for (int i = 0; i < numeroCome; i++) {
            if (come[i] == a) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean huir(Animal a);

    public Animal[] getCome() {
        return come;
    }

    public int getNumCome() {
        return numeroCome;
    }

    public Animal[] getEsComidoPor() {
        return esComidoPor;
    }

    public int getNumeroEsComido() {
        return numeroEsComido;
    }

    @Override
    public String toString() {
        return especie + " (" + familia + ")";
    }
}