package OrientacionAObjetos;

public class GestionaPokemon {
    public static void main(String[] args) {
        Pokemon Pikachu = new Pokemon("Pikachu", "Eléctrico", 50, "Raichu");
        Pokemon rattataSalvaje = new Pokemon("Rattata", "Normal", 30, "Raticate");
        System.out.println("Ha aparecido un: " + rattataSalvaje.nombre);

        System.out.println("¿Gana Pikachu la pelea?");
        boolean resultado = Pikachu.luchar(rattataSalvaje);
        System.out.println("Resultado: " + resultado);

        if (resultado == true) {
            Pikachu.evolucionar();
            System.out.println("Ahora mi pokemon es: " + Pikachu.nombre);
        }
    }
}
