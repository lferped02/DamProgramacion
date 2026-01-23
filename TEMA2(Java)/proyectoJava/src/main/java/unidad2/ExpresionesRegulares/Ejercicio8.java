package unidad2.ExpresionesRegulares;

public class Ejercicio8 {
    public static void main() {
        String[] palabra = {"Hola", "Mundo"};
        int contador = 0;
        for (String p : palabra) {
            if (p.matches("[a-zA-Z]")){
                contador++;
            }
        }
        System.out.println("Las palabras que son solo letras; "+contador);
    }
}
