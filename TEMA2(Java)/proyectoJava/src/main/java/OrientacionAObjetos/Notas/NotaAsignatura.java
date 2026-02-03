package OrientacionAObjetos.Notas;

public class NotaAsignatura {
    String nombreAsignatura;
    double notaT1, notaT2, notaT3;

    public NotaAsignatura(String nombreAsignatura, double notaT1, double notaT2, double notaT3) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaT1 = notaT1;
        this.notaT2 = notaT2;
        this.notaT3 = notaT3;
    }

    public double calcularMedia() {
        return (notaT1 + notaT2 + notaT3) / 3.0;
    }
}