package Herencia.Empresa;

public class Usuario {
    private String dni;
    private String nombre;
    private String departamento;

    public Usuario(String dni, String nombre, String departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario otro = (Usuario) obj;
        return this.dni.equalsIgnoreCase(otro.dni);
    }
}