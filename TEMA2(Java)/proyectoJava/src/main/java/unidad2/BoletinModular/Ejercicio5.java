package unidad2.BoletinModular;

public class Ejercicio5 {
    public static boolean esElegibleDescuento(boolean premium, double gasto, int edad) {
        return (premium && gasto > 50) || edad > 65;
    }

    public static void main(String[] args) {
        boolean premium = true;
        double gasto = 60.0;
        int edad = 40;
        if (esElegibleDescuento(premium, gasto, edad)) {
            System.out.println("El cliente es elegible para el descuento.");
        } else {
            System.out.println("El cliente NO es elegible para el descuento.");
        }
    }
}