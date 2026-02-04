package OrientacionAObjetos.Empleados;

public class Empleado {
    public String nombre;
    public String apellido;
    public double salarioMensual;
    public Departamento departamento;

    public Empleado(String nombre, String apellido, double salarioMensual, Departamento departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        this.departamento = departamento;
        if (departamento != null) {
            departamento.empleados.add(this);
        }
    }

    public double calcularSalarioAnual() {
        return this.salarioMensual * 12;
    }

    public void aumentarSalario(double porcentaje) {
        this.salarioMensual += this.salarioMensual * (porcentaje / 100);
    }

    public void cambiarDepartamento(Departamento nuevoDepto) {
        if (this.departamento != null) {
            this.departamento.empleados.remove(this);
        }
        this.departamento = nuevoDepto;
        nuevoDepto.empleados.add(this);
    }
}
