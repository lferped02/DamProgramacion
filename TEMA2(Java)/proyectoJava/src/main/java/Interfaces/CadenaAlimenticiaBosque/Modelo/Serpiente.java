package Interfaces.CadenaAlimenticiaBosque.Modelo;

public class Serpiente extends Animal {

    public Serpiente(String especie, String habitat) {
        super(especie, "Serpiente", habitat);
    }

    @Override
    public boolean huir(Animal a) {
        return false;
    }
}