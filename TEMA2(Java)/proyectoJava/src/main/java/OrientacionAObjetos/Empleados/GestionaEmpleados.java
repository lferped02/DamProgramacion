package OrientacionAObjetos.Empleados;

import java.util.ArrayList;
import java.util.List;

public class GestionaEmpleados {

    public static Departamento departamentoMejorPagado(List<Departamento> departamentos) {
        Departamento mejor = null;
        double maximaMedia = -1;

        for (Departamento d : departamentos) {
            double mediaActual = d.calcularMediaSalarial();
            if (mediaActual > maximaMedia) {
                maximaMedia = mediaActual;
                mejor = d;
            }
        }
        return mejor;
    }

    public static void main(String[] args) {
        Departamento marketing = new Departamento("Marketing", 12000);
        Departamento ventas = new Departamento("Ventas", 10000);

        Empleado empleado = new Empleado("Renato", "Zapato", 1800, marketing);
        Empleado empleado2 = new Empleado("Zacarías", "Gómez", 1500, marketing);
        Empleado empleado3 = new Empleado("David", "Pérez", 2200, marketing);
        marketing.setJefe(empleado3);

        Empleado empleado4 = new Empleado("Lola", "Romero", 2400, ventas);
        Empleado empleado5 = new Empleado("Marisa", "Rosado", 2500, ventas);
        ventas.setJefe(empleado5);

        List<Departamento> listaDeptos = new ArrayList<>();
        listaDeptos.add(marketing);
        listaDeptos.add(ventas);

        Departamento top = departamentoMejorPagado(listaDeptos);

        System.out.println("Resultados de la gestión:");
        System.out.println("-------------------------");
        System.out.println("El departamento mejor pagado es: " + top.nombre);
        System.out.println("Media salarial de " + top.nombre + ": " + top.calcularMediaSalarial() + "€");

        empleado.aumentarSalario(10);
        System.out.println("Nuevo salario anual de Renato: " + empleado.calcularSalarioAnual() + "€");
    }
}