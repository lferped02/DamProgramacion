package Excepciones.ClaveMorse.Modelo;

import java.util.HashMap;
import java.util.Map;

public class TraductorMorse {
    private Map<Character, String> morse = new HashMap<>();
    public TraductorMorse() {
        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "..-.");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', ".---");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', ".--");
        morse.put('X', "-..-");
        morse.put('Y', "-.--");
        morse.put('Z', "--..");
        morse.put(' ', "/");
    }

    public String traducir(String texto) throws CaracterNoTraducibleException {
        StringBuilder resultado = new StringBuilder();
        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!morse.containsKey(c)) {
                throw new CaracterNoTraducibleException(c, i);
            }
            resultado.append(morse.get(c)).append(" ");
        }
        return resultado.toString();
    }
}
