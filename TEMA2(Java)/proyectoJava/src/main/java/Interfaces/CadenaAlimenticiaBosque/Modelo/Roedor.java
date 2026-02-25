package Interfaces.CadenaAlimenticiaBosque.Modelo;

public class Roedor extends Animal {

    public Roedor(String especie, String habitat) {
        super(especie, "Roedor", habitat);
    }

    @Override
    public boolean huir(Animal a) {
        if (a instanceof Serpiente) {
            return true;
        }
        return false;
    }
}