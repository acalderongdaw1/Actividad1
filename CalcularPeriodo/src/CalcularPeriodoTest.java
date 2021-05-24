import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@Test
	void testCalcularPeriodo() {
		LocalDate aux = LocalDate.of(1879, 5, 5);
		String resul = CalcularPeriodo.calcularPeriodo("Revolución francesa", aux);
		assertEquals("Revolución francesa ocurrió hace 142 años, 0 meses y 19 días.", resul);
	}

}