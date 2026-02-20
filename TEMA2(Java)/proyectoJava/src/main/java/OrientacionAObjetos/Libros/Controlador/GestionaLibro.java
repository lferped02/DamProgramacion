package OrientacionAObjetos.Libros.Controlador;

import OrientacionAObjetos.Libros.Libro;

class GestionaLibro {
     static void main(String[] args) {
        Libro miLibro = new Libro("978-84-450-0030-4", "El Señor de los Anillos", "J.R.R. Tolkien", 423);
        System.out.println("--- Datos completos del libro ---");
        System.out.println(miLibro);
        System.out.println();
        System.out.println("--- Resumen del libro ---");
        miLibro.imprimirResumen();
    }
}