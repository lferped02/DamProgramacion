package ejemplos.EjemplosColecciones.EjemplosListas.Controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionaListas {
    static void main(String[] args) {
        List<String> listaArray = new ArrayList<String>();
        listaArray.add("Barcelona.");
        listaArray.add("Huelva.");
        listaArray.add("Madrid.");

        //Sí está en la lista.
        System.out.println(listaArray.contains("Madrid."));

        //Validación si está, no se debe agregar.
        String cadena = "Sevilla";
        listaArray.add(cadena);
        if(!listaArray.contains(cadena))
            listaArray.add(cadena);

        //Recorre por elementos.
        for (String elemento: listaArray){
            System.out.println(elemento);
        }
        //Recorre por posiciones.
        for (int i = 0; i < listaArray.size(); i++) {
            System.out.println(listaArray.get(i));
        }
        //Recorrer con Iteradores.
        Iterator<String> iterator = listaArray.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
