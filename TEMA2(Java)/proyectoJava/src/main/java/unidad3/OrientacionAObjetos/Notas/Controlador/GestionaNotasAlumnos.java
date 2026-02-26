package unidad3.OrientacionAObjetos.Notas.Controlador;

import unidad3.OrientacionAObjetos.Notas.Modelo.Alumno;
import unidad3.OrientacionAObjetos.Notas.Modelo.NombreAsignatura;
import unidad3.OrientacionAObjetos.Notas.Modelo.NotaAsignatura;

class GestionaNotasAlumnos {
     static void main(String[] args) {
        Alumno lucia = new Alumno("Lucía", "lucia@email.com");
        Alumno andres = new Alumno("Andrés", "andres@email.com");
        Alumno vicente = new Alumno("Vicente", "vicente@email.com");

        lucia.notasProgramacion = new NotaAsignatura(NombreAsignatura.PROGRAMACION, 5, 7, 7);
        lucia.notasBaseDatos = new NotaAsignatura(NombreAsignatura.BASEDEDATOS, 6, 6, 7);
        andres.notasProgramacion = new NotaAsignatura(NombreAsignatura.PROGRAMACION, 4, 4, 6);
        andres.notasBaseDatos = new NotaAsignatura(NombreAsignatura.BASEDEDATOS, 9, 8, 8);
        vicente.notasProgramacion = new NotaAsignatura(NombreAsignatura.PROGRAMACION, 2, 2, 3);
        vicente.notasBaseDatos = new NotaAsignatura(NombreAsignatura.BASEDEDATOS, 6, 6, 7);

        System.out.println("Nota media de Vicente en Programación: " + vicente.notasProgramacion.calcularMedia());
        System.out.println("Nota media de Vicente en Bases de Datos: " + vicente.notasBaseDatos.calcularMedia());
        System.out.println("--- Resultados finales ---");

        vicente.imprimeSiHaAprobado(NombreAsignatura.PROGRAMACION);
        vicente.imprimeSiHaAprobado(NombreAsignatura.BASEDEDATOS);
        lucia.imprimeSiHaAprobado(NombreAsignatura.PROGRAMACION);
        lucia.imprimeSiHaAprobado(NombreAsignatura.BASEDEDATOS);
    }
}