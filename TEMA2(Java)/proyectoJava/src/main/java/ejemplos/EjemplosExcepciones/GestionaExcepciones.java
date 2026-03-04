package ejemplos.EjemplosExcepciones;

public class GestionaExcepciones {
    public static void main(String[] args) {
        try {
            GrupoAlumnos grupo = new GrupoAlumnos(new String[8], new String[8]);
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido una excepción: "+e.getMessage());
        } finally {
            System.out.println("Aquí entro siempre soy un finally.");
        }
        System.out.println("Sigo con mi tarea.");
    }
}
