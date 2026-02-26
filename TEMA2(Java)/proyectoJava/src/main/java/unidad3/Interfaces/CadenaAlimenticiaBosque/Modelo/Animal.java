package Interfaces.CadenaAlimenticiaBosque.Modelo;

public abstract class Animal {
    private String especie;
    private String familia;
    private String habitat;
    private Animal[] come = new Animal[10];
    private Animal[] esComidoPor = new Animal[10];

    private int numeroCome = 0;
    private int numeroEsComidoPor = 0;

    public Animal(String especie, String familia, String habitat) {
        this.especie = especie;
        this.familia = familia;
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public void agregarPresa(Animal a) {
        if (numeroCome < 10) {
            come[numeroCome++] = a;
        }
    }

    public void agregarDepredador(Animal a) {
        if (numeroEsComidoPor < 10) {
            esComidoPor[numeroEsComidoPor++] = a;
        }
    }

    public Animal[] getPresas() {
        return come;
    }

    public Animal[] getDepredadores() {
        return esComidoPor;
    }

    protected boolean mismaEspecie(Animal a) {
        return this.getClass().equals(a.getClass());
    }

    public abstract boolean atacar(Animal a);
    public abstract boolean huir(Animal a);

    @Override
    public String toString() {
        return especie + " (" + familia + ")";
    }
}
