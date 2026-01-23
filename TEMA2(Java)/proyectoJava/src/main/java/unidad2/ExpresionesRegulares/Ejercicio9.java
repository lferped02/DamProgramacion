package unidad2.ExpresionesRegulares;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio9 {
    public static void main(String[] args) {

        String texto = "En caso de incidencias técnicas urgentes, el correo adecuado es soporte.tecnico@empresa.com, " +
                "adjuntando capturas de pantalla si es posible. Para propuestas comerciales o alianzas estratégicas, " +
                "las comunicaciones deben enviarse a negocios@empresa.com. o, alternativamente, a alianzas@partner.org. " +
                "Finalmente, si necesitas hablar directamente con recursos humanos, puedes escribir a rrhh@empresa.com, " +
                "indicando en el asunto el motivo de tu mensaje.";

        String regexEmail = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(texto);
        List<String> listaEmails = new ArrayList<>();
        while (matcher.find()) {
            listaEmails.add(matcher.group());
        }
        System.out.println("--- TABLA DE EMAILS ENCONTRADOS ---");
        for (int i = 0; i < listaEmails.size(); i++) {
            System.out.println("Email " + (i + 1) + ": " + listaEmails.get(i));
        }
    }
}
