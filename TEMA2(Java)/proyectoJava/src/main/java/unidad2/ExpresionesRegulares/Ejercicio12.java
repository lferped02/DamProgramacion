package unidad2.ExpresionesRegulares;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase:");
        String frase = teclado.nextLine();
        String[] palabras = frase.split("\\s+");
        int contador = 0;
        String regexVocal = "(?i)^[aeiouáéíóúü].*";
        for (String p : palabras) {
            p = p.trim();

            if (p.matches(regexVocal)) {
                contador++;
            }
        }
        System.out.println("Número de palabras que empiezan por vocal: " + contador);
        teclado.close();
    }
}
