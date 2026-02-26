package unidad3.OrientacionAObjetos.Pokemon.Controlador;


import unidad3.OrientacionAObjetos.Pokemon.Modelo.Pokemon;

class GestionaPokemon {
     static void main(String[] args) {
        Pokemon raichu = new Pokemon("Raichu", "Eléctrico", 100, null);
        Pokemon raticate = new Pokemon("Raticate", "Normal", 60, null);

        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 50, raichu);
        Pokemon rattataSalvaje = new Pokemon("Rattata", "Normal", 30, raticate);

        System.out.println("Combate: " + pikachu + " VS " + rattataSalvaje);
        System.out.println("\n¿Gana " + pikachu.nombre + " la pelea?");
        boolean resultado = pikachu.luchar(rattataSalvaje);

        System.out.println("Resultado: " + (resultado ? "¡SÍ!" : "NO"));

        if (resultado) {
            pikachu.evolucionar();
            System.out.println("Estado actual de mi Pokemon: " + pikachu);
        }
    }
}