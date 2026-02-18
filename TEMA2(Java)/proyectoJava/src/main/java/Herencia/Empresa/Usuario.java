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

    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return dni.equals(usuario.dni);
    }
}