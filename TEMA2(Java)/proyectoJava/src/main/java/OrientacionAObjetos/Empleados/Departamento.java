package OrientacionAObjetos.Empleados;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    public String nombre;
    public double presupuesto;
    public Empleado jefe;
    public List<Empleado> empleados;

    public Departamento(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.empleados = new ArrayList<>();
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public double calcularMediaSalarial() {
        if (empleados.isEmpty()) return 0;
        double suma = 0;
        for (Empleado e : empleados) {
            suma += e.salarioMensual;
        }
        return suma / empleados.size();
    }
}