package ejemplos.EjemplosDias;

public class Dia7 {
    public static void main(String[]args) {
        //Expresiones regulares: Fecha.
        String frase = "Hoy es 22/01/2026";
        String patron = ".*\\d{2}/\\d{2}/\\d{4}.*";

        if(frase.matches(patron)){
            System.out.println("Hay una fecha.");
        } else {
            System.out.println("No coincide la fecha.");
        }
        //Expresiones regulares: DNI.
        String frase1 = "Este es mi DNI: 25987430L";
        String dni = "\\d{8}[a-zA-Z]";
        if(frase1.matches(dni)){
            System.out.println("Este es mi DNI.");
        } else {
            System.out.println("Este no es mi DNI.");
        }
        //Expresiones regulares: Matricula del coche.
        String frase2 = "Este es mi matricula del coche: 9632MYL";
        String matricula = ".*\\d{4}[a-zA-Z]{3}.*";
        if(frase2.matches(matricula)){
            System.out.println("Es una matricula válida.");
        } else {
            System.out.println("No es mi matricula de coche.");
        }
        // Expresiones regulares: Gmail.
        String frase3 = "nombreUsuario@gmail.com";
        String gmail = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        if(frase3.matches(gmail)){
            System.out.println("Es un gmail válido.");
        } else {
            System.out.println("No es un gmail válido.");
        }
    }
}
