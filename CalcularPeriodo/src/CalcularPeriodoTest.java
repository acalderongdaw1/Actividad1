import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@Test
	void testCalcularPeriodo() {
		LocalDate aux = LocalDate.of(1879, 5, 5);
		String resul = CalcularPeriodo.calcularPeriodo("Revoluci�n francesa", aux);
		assertEquals("Revoluci�n francesa ocurri� hace 142 a�os, 0 meses y 19 d�as.", resul);
	}

}