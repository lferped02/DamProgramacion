package OrientacionAObjetos.Notas.Modelo;

 public class NotaAsignatura {
    NombreAsignatura nombreAsignatura;
    double notaT1, notaT2, notaT3;

     public NotaAsignatura(NombreAsignatura nombreAsignatura, double notaT1, double notaT2, double notaT3) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaT1 = notaT1;
        this.notaT2 = notaT2;
        this.notaT3 = notaT3;
    }

     public double calcularMedia() {

         return (notaT1 + notaT2 + notaT3) / 3.0;
    }

     int trimestreAprobados() {
        int contador = 0;
        if (notaT1 >= 5) contador++;
        if (notaT2 >= 5) contador++;
        if (notaT3 >= 5) contador++;
        return contador;
    }

    @Override
    public String toString() {
        return nombreAsignatura + " [T1: " + notaT1 + ", T2: " + notaT2 + ", T3: " + notaT3 + "]";
    }
}