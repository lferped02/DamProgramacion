package unidad3.Excepciones.ClaveMorse;

public class CaracterNoTraducibleException extends Exception {
    private char caracter;
    private int posicion;

    public CaracterNoTraducibleException(char caracter, int posicion) {
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