package unidad2.ExpresionesRegulares;

public class Ejercicio2 {
    public static void main(String[] args) {
        String minuscula = "abcde";
        System.out.println("Las 5 minúsculas: " + minuscula.matches("[a-z]{5}"));
    }
}
