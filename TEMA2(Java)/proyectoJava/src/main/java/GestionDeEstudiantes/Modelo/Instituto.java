package unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<Grupo> grupos;

    public Instituto() {
        grupos = new ArrayList<>();
    }

    public void agregarGrupo(Grupo g) {
        grupos.add(g);
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public Grupo buscarGrupo(String descripcion) {
        for (Grupo g : grupos) {
            if (g.getDescripcion().equalsIgnoreCase(descripcion)) {
                return g;
            }
        }
        return null;
    }

    public Estudiante buscarEstudiante(String id) {
        for (Grupo g : grupos) {
            for (Estudiante e : g.getEstudiantes()) {
                if (e.getId().equals(id)) {
                    return e;
                }
            }
        }
        return null;
    }
}
