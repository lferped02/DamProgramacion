package unidad4.Clonables.EmpresaAlquilerCoche.Modelo;

public class Coche implements Cloneable {
    private String matricula;
    private String modelo;
    private int kilometraje;
    private Motor motor;

    public Coche(String matricula, String modelo, int kilometraje, Motor motor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.motor = motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public Coche clone() throws CloneNotSupportedException {
        Coche coche = (Coche) super.clone();
        coche.motor = (Motor) this.motor.clone();
        return coche;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", motor=" + motor +
                '}';
    }
}