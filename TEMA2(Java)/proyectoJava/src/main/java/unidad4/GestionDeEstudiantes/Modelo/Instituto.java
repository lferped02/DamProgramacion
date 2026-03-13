package unidad4.GestionDeEstudiantes.Modelo;

import unidad4.GestionDeEstudiantes.Excepciones.GrupoNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<Grupo> grupos;

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