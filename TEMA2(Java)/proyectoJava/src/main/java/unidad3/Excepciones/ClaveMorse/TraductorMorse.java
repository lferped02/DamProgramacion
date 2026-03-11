package unidad3.Excepciones.ClaveMorse;

import java.util.Scanner;
import unidad3.Excepciones.Ejercicio5.MiExcepcion;

public class TraductorMorse {
    public boolean comprobarTexto(String texto) throws MiExcepcion {
        boolean invalido = false;
        String validaLetras = "[a-z]+";
        System.out.println(texto + " " + texto.matches(validaLetras));

        if (texto.matches(validaLetras)) {
            invalido = false;
        } else {
            invalido = true;
            throw new MiExcepcion("Texto inválido.");
        }
        return invalido;
    }

    public static void main(String[] args) {
        TraductorMorse morse = new TraductorMorse();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un texto:");
        String texto = scanner.nextLine();

        while (!texto.equals("FIN")) {
            try {
                boolean valido = morse.comprobarTexto(texto);
                System.out.println("Texto válido: " + !valido);
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Dame un texto:");
            texto = scanner.nextLine();
        }
    }
}

