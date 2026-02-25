package Interfaces.CadenaAlimenticiaBosque.Modelo;

public class AveRapaz extends Animal {
    public AveRapaz(String especie, String habitat) {
        super(especie, "Rapaz", habitat);
    }

    @Override
    public boolean atacar(Animal a) {
        if (mismaEspecie(a)) return false;
        return (a instanceof Serpiente || a instanceof Roedor);
    }

    @Override
    public boolean huir(Animal a) {
        if (mismaEspecie(a)) return false;
        return (a instanceof Leon);
    }
}
