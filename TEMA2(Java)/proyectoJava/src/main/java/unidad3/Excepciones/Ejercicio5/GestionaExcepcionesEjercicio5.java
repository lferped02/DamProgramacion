package unidad3.Excepciones.Ejercicio5;

public class GestionaExcepcionesEjercicio5 {
    void metodo1() throws MiExcepcion {
        throw new MiExcepcion("Lanzando mi Excepcion.");
    }

    public static void main(String[] args){
        GestionaExcepcionesEjercicio5 g = new GestionaExcepcionesEjercicio5();
        try {
            g.metodo1();
        } catch (MiExcepcion e) {
            System.out.println(e.toString());
        }
    }
}
