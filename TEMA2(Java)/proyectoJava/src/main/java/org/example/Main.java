package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Mi clase"); //sout ctrl + espacio
        int numero1; //Declaro el número entero numero1 declaro solo una vez (tipo)
        numero1 = 10;
        int numero2 = 1000;
        int resultado = numero1 + numero2;
        System.out.println(resultado);
        boolean encontrado = false;
        String miCadena; //Declaro variable miCadena pero no la inicializo (valor)
        miCadena = "Mi cadena con valor";
        System.out.println(miCadena);
        if (encontrado) {
            System.out.println("No encontrado");
        } else {
            System.out.println("Encontrado");
            System.out.println("Dentro del else");
        }
    }
}
