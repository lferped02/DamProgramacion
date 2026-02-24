package Estatico.TiendaDeAnimales.Controlador;

import Estatico.TiendaDeAnimales.Modelo.Loro;
import Estatico.TiendaDeAnimales.Modelo.Mascotas;
import Estatico.TiendaDeAnimales.Modelo.Perro;
import Interfaces.Animal.Modelo.Perrito;

import java.time.LocalDate;

public class GestionaTiendaDeAnimales {
    public static void main(String[] args) {
        Mascotas[] tienda= new Mascotas[50];
        int numeroMascota = 0;

        Mascotas perro1 = new Perro("Neox", 3, LocalDate.of(2026,02,15), "Pequinés", false);
        Loro loro1 = new Loro("Paco", 2, LocalDate.of(2026,02,12), "Marruecos", true);

        tienda[numeroMascota]=perro1;
        numeroMascota++;
        tienda[numeroMascota] = loro1;
        for (Mascotas m:tienda){
            System.out.println(m);
        }

    }
}
