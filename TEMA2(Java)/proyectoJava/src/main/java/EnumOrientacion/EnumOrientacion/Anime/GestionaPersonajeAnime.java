package EnumOrientacion.Anime;

public class GestionaPersonajeAnime {
    public static void main(String[] args) {
        SerieAnime onePiece = new SerieAnime("One Piece", "Eiichirō Oda");
        Luffy luffy = new Luffy("Luffy");
        // Tiempo de compilación y en tiempo de Ejecución es tipo Luffy.
        // Todo lo que se ve del PersonajeAnime y todo lo de Luffy.
        Luffy luffy1 = new Luffy ("Luffy2");
        // Tiempo de compilación PersonajeAnime y tiempo de Ejecucion Luffy.
        // Tiene sólo lo de PersonajeAnime.
        // Luffy luffyTemporada2 = new PersonajeAnime("luffy2");
        // No compila Tiempo Compilación tipo Luffy pero en Tiempo de ejecución PersonajeAnime.
        // Pasar a Luffy supone perder información ->FALLA.
        Luffy luffyTemporada2 = (Luffy) new PersonajeAnime("Luffy");
        // Casting explícito desde Personaje a Luffy.

        Goku goku= new Goku("Goku");
        PersonajeAnime anime = goku;
        // Luffy animeLuffy = (Luffy) goku; Falla

        PersonajeAnime goku2 = new Goku("Goku");
        Luffy animeLuffy = (Luffy) goku2; // Compila.
        // En tiempo de Ejecución esto da ClassCastException.

        luffy.reir();
        luffy.setSerie(onePiece);
        System.out.println(luffy);
    }
}
