package ejemplos.EjemplosColecciones.EjemplosListas.Controlador;

import ejemplos.EjemplosColecciones.EjemplosListas.Modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class GestionaEstudiantes {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Lorena", 1);
        Estudiante e2 = new Estudiante("Samuel", 2);
        Estudiante e3 = new Estudiante("Noelia", 3);
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        GestionaEstudiantes g = new GestionaEstudiantes();
        g.agregarEstudiante(e1, estudiantes);
        g.agregarEstudiante(e2, estudiantes);
        g.agregarEstudiante(e3, estudiantes);

        for (Estudiante e : estudiantes){
            System.out.println(e);
        }
    }
    private boolean agregarEstudiante(Estudiante e, List<Estudiante>lista){
        boolean agregado = false;
        if (!lista.contains(e)){
            agregado = true;
        }
        return agregado;
    }
}
