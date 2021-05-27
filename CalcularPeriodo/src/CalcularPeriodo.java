import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuánto tiempo ha pasado
		System.out.println(calcularPeriodo("El descubrimiento de América", fecha));
		
		LocalDate fecha2 = LocalDate.of(1879, Month.MAY, 5);	 
		System.out.println(calcularPeriodo("La Revoluci�n francesa", fecha2));
		
		LocalDate fecha3 = LocalDate.of(2010, Month.JUNE, 16);	 
		System.out.println(calcularPeriodo("El descubrimiento de América", fecha3));
		
		LocalDate fecha4 = LocalDate.of(1939, Month.SEPTEMBER, 1);	 
		System.out.println(calcularPeriodo("El descubrimiento de América", fecha4));
		
		LocalDate fecha5 = LocalDate.of(2001, Month.SEPTEMBER, 11);	 
		System.out.println(calcularPeriodo("El atentado del 11S", fecha5));
	}
	
	public static String calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurri� hace %d a�os, %d meses y %d d�as.", anyos, meses, dias);
         
		return texto;
    }
 
}
