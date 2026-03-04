package ejemplos.EjemplosExcepciones;

public class GrupoAlumnos {
    private String[] nombres;
    private String[] apellidos;

    public GrupoAlumnos(String[] nombre, String[] apellidos) throws NullPointerException {
        this.setNombres(nombre);
        this.setApellidos(apellidos);
    }

    public GrupoAlumnos() {
        nombres = new String[20];
        apellidos = new String[20];
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) throws NullPointerException {
        if(nombres.length > 20){
            throw new NullPointerException ("Llega más de 20 nombres.");
        }
        System.out.println("Llego a asignación de nombres.");
        this.nombres = nombres;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        if(apellidos.length > 20){
            throw new NullPointerException("Llega más de 20 apellidos.");
        }
        this.apellidos = apellidos;
    }
}
