package Excepciones.ClaveMorse.Modelo;

public class CaracterNoTraducibleException extends Exception {
    private char caracter;
    private int posicion;

    public CaracterNoTraducibleException(char caracter, int posicion) {
        super("Carácter no traducible: '" + caracter + "' en posición " + posicion);
        this.caracter = caracter;
        this.posicion = posicion;
    }

    public char getCaracter() {
        return caracter;
    }

    public int getPosicion() {
        return posicion;
    }
}
