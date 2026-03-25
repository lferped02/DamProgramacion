package ejemplos.EjemplosColecciones.EjemplosMapas.Controlador;

import ejemplos.EjemplosColecciones.EjemplosMapas.Modelo.Alumno;

import java.util.*;

public class GestionaMapas {
    public static void main(String[] args) {
        Map<Alumno, Double> map = new HashMap<Alumno, Double>();

        Alumno alumno = new Alumno("12345678A");
        Alumno alumno2 = new Alumno("98765432B");
        Alumno alumno3 = new Alumno("45678912C");

        map.put(alumno, 2d);
        map.put(alumno2, 32d);
        map.put(alumno3, 4d);

        System.out.println(map.toString());
        System.out.println(map.size());
        Set<Alumno> claves = map.keySet();
        System.out.println(claves);
        Collection<Double> valores = map.values();
        System.out.println(valores);

        Map<Alumno, List<Double>> mapa2 = new LinkedHashMap<Alumno, List<Double>>();
        List<Double> lista1 = new ArrayList<Double>();
        lista1.add(7d);
        lista1.add(9d);

        List<Double> lista2 = new ArrayList<Double>();
        lista2.add(5d);
        lista2.add(5d);

        mapa2.put(alumno, lista1);
        mapa2.put(alumno2, lista2);
        List<Double> valoresPersona2 = mapa2.get(alumno2);
        valoresPersona2.add(4d);
        System.out.println(mapa2);

    }
}
