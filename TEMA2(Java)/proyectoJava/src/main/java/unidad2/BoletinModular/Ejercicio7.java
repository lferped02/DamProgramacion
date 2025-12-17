package unidad2.BoletinModular;

public class Ejercicio7 {
    public void imprimeMultiplos(int numero) {
        for (int i = numero; i <= numero*10; i += numero) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ejercicio7 referencia = new Ejercicio7();
        referencia.imprimeMultiplos(3);
    }
}

