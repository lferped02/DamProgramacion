package Interfaces.CadenaAlimenticiaBosque.Modelo;

public class Leon extends Animal {

    public Leon(String especie, String habitat) {
        super(especie, "León", habitat);
    }

    @Override
    public boolean huir(Animal a) {
        return false;
    }
}