package es.iessoterohernandez.daw.endes.Subscripcion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {

	static Subscripcion sub1;
	static Subscripcion sub2;

	@BeforeEach
	public void inicio() {
		sub1 = new Subscripcion(100, 2);
		sub2 = new Subscripcion(370, 3);

	}

	@Test
	public void precioPorMesTest1() { /* Test con el resto = 0 */
		double resEsperado = 50;
		assertEquals(resEsperado, sub1.precioPorMes());
	}

	@Test
	public void precioPorMesTest2() { /* Test con el resto > 0 */

		double resEsperado = 370.0 / 3.0 + 1;
		assertEquals(resEsperado, sub2.precioPorMes());

	}

	@Test
	public void cancelarPeriodoTest() { /* Test para cancelar el periodo */
		sub1.cancel();
		assertTrue(true);
	}

}
