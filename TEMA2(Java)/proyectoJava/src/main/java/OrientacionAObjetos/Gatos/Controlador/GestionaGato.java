package OrientacionAObjetos.Gatos.Controlador;

import OrientacionAObjetos.Gatos.Gato;

class GestionaGato {
     static void main(String[] args) {
        Gato gata1 = new Gato("Blanco", "Persa", "hembra", 3, 4.2);
        Gato gata2 = new Gato("Gris", "Siamés", "hembra", 2, 3.8);
        Gato gatoMacho = new Gato("Naranja", "Común", "macho", 5, 5.5);
        System.out.println("Gata 1 (Blanca):");
        gata1.maullar();
        gata1.comer("pienso");

        System.out.println("\nGata 2 (Gris):");
        gata2.ronronear();
        gata2.comer("pescado");

        System.out.println("\n--- Pruebas de Pelea ---");
        System.out.print("Gata 1 vs Gata 2 (Mismo sexo): ");
        gata1.pelear(gata2);
        System.out.print("Gato Macho vs Gata 1 (Distinto sexo): ");
        gatoMacho.pelear(gata1);
        }
    }
