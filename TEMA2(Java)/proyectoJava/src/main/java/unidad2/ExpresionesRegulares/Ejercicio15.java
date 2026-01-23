package unidad2.ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio15 {
    public static void main(String[] args) {
        String texto = "Hola_ esto es un ejemplo_de_codigo con minusculas_ y MAYUSCULAS_";
        String regex = "[a-z]+_";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Coincidencias encontradas:");
        while (matcher.find()) {
            System.out.println("- " + matcher.group());
        }
    }
}
