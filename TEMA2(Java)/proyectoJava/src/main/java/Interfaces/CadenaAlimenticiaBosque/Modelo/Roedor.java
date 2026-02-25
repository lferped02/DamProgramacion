package Interfaces.CadenaAlimenticiaBosque.Modelo;

public class Roedor extends Animal {
    public Roedor(String especie, String habitat) {
        super(especie, "Roedor", habitat);
    }

    @Override
    public boolean atacar(Animal a) {
        return false;
    }

    @Override
    public boolean huir(Animal a) {
        if (mismaEspecie(a)) return false;
        return (a instanceof Serpiente);
    }
}
