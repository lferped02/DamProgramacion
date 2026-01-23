package unidad2.ExpresionesRegulares;

public class Ejercicio16 {
    public static void main(String[] args) {
        String[] pruebas = {"capa", "opción", "pala", "stop", "a p b"};
        String regex = ".+p.+";

        System.out.println("Validación de 'p' en medio:");
        for (String s : pruebas) {
            if (s.matches(regex)) {
                System.out.println("'" + s + "' es válida.");
            } else {
                System.out.println(" '" + s + "' NO es válida.");
            }
        }
    }
}
