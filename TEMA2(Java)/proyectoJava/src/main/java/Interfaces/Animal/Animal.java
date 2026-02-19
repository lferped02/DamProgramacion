package Interfaces.Animal;

public class Animal extends SerVivo {
    public void comer(){
        System.out.println("Está comiendo.");
    }
    public void respirar(){
        System.out.println("Está respirando.");
    }
    @Override
    public boolean estaVivo() {
        return false;
    }

    @Override
    public boolean seDesplaza() {
        return false;
    }
}
