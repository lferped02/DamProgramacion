package ExpresionesRegulares;

public class Validaciones {
    public static void main(String[] args) {
        //Ejercicio 1-> Solo número.
        String numero = "12345";
        System.out.println("Solo número: " + numero.matches("\\d+"));
        //Ejercicio 2-> Exactamente 5 letras minúsculas.
        String minuscula = "abcde";
        System.out.println("Las 5 minúsculas: " + minuscula.matches("[a-z]{5}"));
        //Ejercicio 3-> Contraseña de al menos 8 caracteres.
        String contrasenia = "01234567";
        System.out.println("La contraseña es: " + contrasenia.matches(".{8,}"));
        //Ejercicio 4-> Matrícula.
        String matricula = "01234BCD";
        System.out.println("La matrícula es: " + matricula.matches("\\d{4}[B-DF-HJ-NP-TV-Z]{3}"));
        //Ejercicio 5 -> Empieza por "DAM".
        String dam = "DAMCurso2026";
        System.out.println("Empieza DAM " + dam.startsWith("DAM"));
        //Ejecicio 6-> Contiene algún número.
        String frase = "Hola tengo 23 años";
        System.out.println("¿Tiene algún número?: " + frase.matches(".*[0-9].*"));
        //Ejercicio 7-> Mostrar DNI válido de una lista.
        String[] listaDni = {"12345678Z", "89M", "98765432R"};
        System.out.println("Los DNI's Validos encontrados: ");
        for (String dni : listaDni) {
            if (dni.matches("[0-9]{8}[A-Z]")) {
                System.out.println(dni + " ");
            }
        }
        System.out.println();
        //Ejercicio 8-> Contar cuántas palabras son solo letras.
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
