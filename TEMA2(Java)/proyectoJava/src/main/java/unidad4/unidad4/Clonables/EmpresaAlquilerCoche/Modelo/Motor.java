package unidad4.Clonables.EmpresaAlquilerCoche.Modelo;

public class Motor implements Cloneable{
    private Combustible tipo;
    private int cv;
    private boolean enMarcha;

    public Motor(Combustible tipo, int cv, boolean enMarcha) {
        this.tipo = tipo;
        this.cv = cv;
        this.enMarcha = enMarcha;
    }

    public Combustible getTipo() {
        return tipo;
    }

    public void setTipo(Combustible tipo) {
        this.tipo = tipo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo=" + getTipo() +
                ", cv=" + getCv() +
                ", enMarcha=" + isEnMarcha() +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
