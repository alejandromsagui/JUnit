package es.iessoterohernandez.daw.endes.OperadorAritmetico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {

	/*
	 * Esta vez crearé las variables dentro de cada método para ir probando números
	 * distintos
	 */

	@Test
	public void sumaTest() { /* Test para la suma */
		int a = 2;
		int b = 4;

		assertEquals(6, OperadorAritmetico.suma(a, b));
	}

	@Test
	public void division() { /* Test para la división con b != 0 */
		int a = 10;
		int b = 5;

		try {
			OperadorAritmetico.division(a, b);
		} catch (Exception e) {
			fail("No debe fallar, ya que es una división entre enteros normal");
		}
	}

	@Test
	public void division2() { /* Test para la división con b = 0 */
		int a = 20;
		int b = 0;

		try {
			OperadorAritmetico.division(a, b);
			fail("La variable b es = 0, imposible realizar la división");
		} catch (Exception e) {
			assertTrue(true);
		}

	}
}
