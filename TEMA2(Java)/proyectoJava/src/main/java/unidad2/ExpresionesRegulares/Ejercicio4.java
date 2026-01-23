package unidad2.ExpresionesRegulares;

public class Ejercicio4 {
    public static void main(String[] args) {
        String matricula = "01234BCD";
        System.out.println("La matrícula es: " + matricula.matches("\\d{4}[B-DF-HJ-NP-TV-Z]{3}"));
    }
}
