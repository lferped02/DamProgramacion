package Interfaces.CadenaAlimenticiaBosque.Controlador;

import Interfaces.CadenaAlimenticiaBosque.Modelo.*;

public class GestionaCadenaAlimenticia {
    private Animal[] animales = new Animal[10];
    private int numAnimales = 0;

    public GestionaCadenaAlimenticia() {
        Animal cobra = new Serpiente("Cobra", "Selva");
        Animal aguilaReal = new AveRapaz("Águila Real", "Montaña");
        Animal halcon = new AveRapaz("Halcón", "Bosque");
        Animal conejo = new Roedor("Conejo", "Bosque");
        Animal leon = new Leon("León", "Sabana");

        agregarAnimal(cobra);
        agregarAnimal(aguilaReal);
        agregarAnimal(halcon);
        agregarAnimal(conejo);
        agregarAnimal(leon);
    }

    private void agregarAnimal(Animal a) {
        if (numAnimales < 10) {
            animales[numAnimales++] = a;
        }
    }

    public void imprimirDepredadorDe(Animal a) {
        System.out.println(a + " es depredador de:");
        for (Animal otro : animales) {
            if (otro != null && a.atacar(otro)) {
                System.out.println(" - " + otro);
            }
        }
    }

    public void imprimirEsPresaDe(Animal a) {
        System.out.println(a + " es presa de:");
        for (Animal otro : animales) {
            if (otro != null && otro.atacar(a)) {
                System.out.println(" - " + otro);
            }
        }
    }

    public void imprimirPuedeHuirDe(Animal a) {
        System.out.println(a + " puede huir de:");
        for (Animal otro : animales) {
            if (otro != null && a.huir(otro)) {
                System.out.println(" - " + otro);
            }
        }
    }

    public static void main(String[] args) {
        GestionaCadenaAlimenticia gestion = new GestionaCadenaAlimenticia();
        for (Animal a : gestion.animales) {
            if (a != null) {
                gestion.imprimirDepredadorDe(a);
                gestion.imprimirEsPresaDe(a);
                gestion.imprimirPuedeHuirDe(a);
                System.out.println("---------------------------");
            }
        }
    }
}
