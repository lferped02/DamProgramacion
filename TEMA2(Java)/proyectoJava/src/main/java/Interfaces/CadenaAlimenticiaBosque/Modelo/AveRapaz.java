package Interfaces.CadenaAlimenticiaBosque.Modelo;

public class AveRapaz extends Animal {

    public AveRapaz(String especie, String habitat) {
        super(especie, "Rapaz", habitat);
    }

    @Override
    public boolean huir(Animal a) {
        if (a instanceof Leon) {
            return true;
        }
        return false;
    }
}