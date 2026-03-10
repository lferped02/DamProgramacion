package ejemplos.EjemplosExcepciones.Grupos;

public class GestionaExcepciones {
    public static void main(String[] args) {
        try {
            GrupoAlumnos grupo = new GrupoAlumnos(new String[8], new String[8]);
        } catch (ClassNotFoundException e) {
            System.out.println("Ocurre ClassNotFoundE "+e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ocurre NullPointer "+e.getMessage());
            throw e;
        } finally {
            System.out.println("Aquí entro siempre soy un finally.");
        }
        System.out.println("Sigo con mi tarea.");
    }
}
