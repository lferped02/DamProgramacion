package unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo;

import unidad4.Colecciones.Listas.GestionDeEstudiantes.Excepciones.GrupoNoEncontradoException;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<Grupo> grupos;

    public Instituto() {
        grupos = new ArrayList<>();
    }

    public void agregarGrupo(Grupo g) {
        grupos.add(g);
    }

    public Grupo buscarGrupo(String descripcion) throws GrupoNoEncontradoException {
        for (Grupo g : grupos) {
            if (g.getDescripcion().equalsIgnoreCase(descripcion)) {
                return g;
            }
        }
        throw new GrupoNoEncontradoException("Grupo no encontrado");

    }
}