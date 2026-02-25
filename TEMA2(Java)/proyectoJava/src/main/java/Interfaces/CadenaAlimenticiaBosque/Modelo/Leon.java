package Interfaces.CadenaAlimenticiaBosque.Modelo;

public class Leon extends Animal {
    public Leon(String especie, String habitat) {
        super(especie, "León", habitat);
    }

    @Override
    public boolean atacar(Animal a) {
        if (mismaEspecie(a)) return false;
        return true;
    }

    @Override
    public boolean huir(Animal a) {
        return false;
    }
}
