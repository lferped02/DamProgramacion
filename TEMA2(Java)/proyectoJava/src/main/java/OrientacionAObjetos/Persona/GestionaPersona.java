package OrientacionAObjetos.Persona;

public class GestionaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Paula", 21, "Cuenca", "Gimnasia Ritmica", "Avatar");
        System.out.println(persona.toString());

        Persona persona1 = new Persona();
        persona1.nombre = "Antonio";
        persona1.edad = 26;
        persona1.lugarNacimiento = "Málaga";
        persona1.deporteFavorito = "Baloncesto";
        persona1.peliculaFavorita = "Harry Potter";
        System.out.println(persona1.toString());
        persona.hablar();
        persona1.comer();

    }
}
