package ejemplos.EjemplosExcepciones.Personas;

public class GestionaExcepcionesPropias {
    public static void main(String[] args) {
        try {
            throw new PersonaException("Lanzo excepción en el main.");
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continuo con el Main.");
    }
}
