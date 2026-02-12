package ejemplos.EjemplosOperadores;

public class OperadoresAvanzados {
    public static void main() {
        int x=23;
        int y=33;
        int z=43;
        int resultado = (x > y) ?
                (x > z ? x : z)
                : (y > z ? y : z);
        System.out.println(resultado);
    }
}
