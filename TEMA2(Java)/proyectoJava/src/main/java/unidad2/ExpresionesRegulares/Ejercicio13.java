package unidad2.ExpresionesRegulares;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("DNI válido: " + validarDNI("12345678Z"));
        System.out.println("Fecha válida: " + validarFecha("15/03/2024"));
        System.out.println("Matrícula válida: " + validarMatricula("1234BBB"));
        System.out.println("Nombre válido: " + validarNombre("Juan José"));
    }
    public static boolean validarDNI(String dni) {
        return dni.matches("^\\d{8}[A-Za-z]$");
    }
    public static boolean validarFecha(String fecha) {
        return fecha.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }
    public static boolean validarMatricula(String matricula) {
        return matricula.matches("^\\d{4}[A-Z]{3}$");
    }
    public static boolean validarNombre(String nombre) {
        return nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
    }
}
