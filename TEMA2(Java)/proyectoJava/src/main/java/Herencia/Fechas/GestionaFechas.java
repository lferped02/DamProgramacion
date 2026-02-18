package Herencia.Fechas;

import java.time.LocalDate;
import java.time.Month;

public class GestionaFechas {
    public static void main(String[] args) {
        LocalDate fechaExamen = LocalDate.of(2024, 5, 15);
        // Extraer partes de la fecha
        int anio = fechaExamen.getYear();
        Month mes = fechaExamen.getMonth(); // Devuelve un objeto Enum (MAY)
        int mesInt = fechaExamen.getMonthValue();
        int diaMes = fechaExamen.getDayOfMonth();
        // Día de la semana (Lunes, Martes...)
        String diaSemana = fechaExamen.getDayOfWeek().toString();

        System.out.println("Año: "+anio+ " mes: "+mesInt+ " día: "+diaMes);
    }
}

