package ejemplos.EjemplosColecciones.EjemplosClonables.Controlador;

import ejemplos.EjemplosColecciones.EjemplosClonables.Modelo.Direccion;
import ejemplos.EjemplosColecciones.EjemplosClonables.Modelo.Humano;

public class GestionaHumano {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Gran Via", 10, "Madrid");
        Humano humano = new Humano("Marta", "123445678A", d1);
        Humano humano2 = null;

        try {
            humano2 = humano.clone();
        } catch (CloneNotSupportedException e) {
           throw new RuntimeException(e);
        }
        Humano humano3 = humano2;
        humano3.getDireccion().setCalle("Sevilla");

        System.out.println(humano);
        System.out.println(humano2);
        System.out.println(humano == humano2);
    }
}