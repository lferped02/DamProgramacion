package unidad3.Excepciones.Ejercicio2;

public class GestionaClase {
    static void main(String[]args) {
        try{
            Miclase m = new Miclase();
            m.m1();
            System.out.println("Detrás de m1.");
        } catch (NullPointerException e) {
            System.out.println("Genero NullPointer "+e.getMessage());
        } finally {
            System.out.println("Aquí entro siempre soy un finally.");
        }
        System.out.println("Sigo fuera del finally.");
    }
}
