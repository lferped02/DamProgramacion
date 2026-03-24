package ejemplos.EjemplosColecciones.EjemplosClonables.Modelo;

public class Humano implements Cloneable {
    private String nombre;
    private String dni;
    private Direccion direccion;

    public Humano(String nombre, String dni, Direccion direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", direccion=" + getDireccion() +
                '}';
    }

    @Override
    public Humano clone() throws CloneNotSupportedException {
        Humano copia = (Humano) super.clone();
        copia.direccion = new Direccion(
                direccion.getCalle(),
                direccion.getNumero(),
                direccion.getCiudad()
        );
        return copia;
    }
}