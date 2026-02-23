package Estatico.TiendaAnimales.Modelo;

import java.util.ArrayList;

public class GestionaTiendaDeAnimales {
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public void insertarMascota(Mascota m) { mascotas.add(m); }

    public void mostrarLista() {
        for (Mascota m : mascotas) System.out.println(m.toString());
    }

    public void mostrarTodo() {
        for (Mascota m : mascotas) m.muestra();
    }

    public void obtenerInfo(Mascota m) {
        m.muestra();
    }

    public void obtenerInfo(String nombre, double peso, String especie) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equals(nombre) && m.getPeso() == peso && m.getClass().getSimpleName().equalsIgnoreCase(especie)) {
                m.muestra();
            }
        }
    }

    public void eliminar(Mascota m) {
        mascotas.remove(m);
    }

    public void eliminar(String nombre, String especie, double peso) {
        mascotas.removeIf(m -> m.getNombre().equals(nombre) && m.getPeso() == peso && m.getClass().getSimpleName().equalsIgnoreCase(especie));
    }

    public Mascota masPesadoGlobal() {
        Mascota maxima = mascotas.get(0);
        for (Mascota m : mascotas) if (m.getPeso() > maxima.getPeso()) maxima = m;
        return maxima;
    }
}