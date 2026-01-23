package unidad2.ExpresionesRegulares;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] listaDni = {"12345678Z", "89M", "98765432R"};
        System.out.println("Los DNI's Validos encontrados: ");
        for (String dni : listaDni) {
            if (dni.matches("[0-9]{8}[A-Z]")) {
                System.out.println(dni + " ");
            }
        }
        System.out.println();
    }
}
