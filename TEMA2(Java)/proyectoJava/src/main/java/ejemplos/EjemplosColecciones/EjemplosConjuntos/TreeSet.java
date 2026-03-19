package ejemplos.EjemplosColecciones.EjemplosConjuntos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> arbol = new HashSet<>();
        Random random = new Random();
        while (arbol.size() < 10){
            int numero = random.nextInt(0,20);
            arbol.add(numero);
        }
        System.out.println(arbol);
    }
}
