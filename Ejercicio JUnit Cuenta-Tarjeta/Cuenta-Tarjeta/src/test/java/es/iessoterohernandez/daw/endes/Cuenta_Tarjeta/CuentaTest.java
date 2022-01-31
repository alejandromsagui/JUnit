package es.iessoterohernandez.daw.endes.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta cuenta;

	@BeforeEach
	public void inicio() {
		cuenta = new Cuenta("IES456325", "Alejandro");

	}

	@Test
	public void ingresarTest() throws Exception {
		try {
			cuenta.ingresar(-1); /* Este test va a dar errores en su mayoría por las excepciones */
		} catch (Exception e) {
			fail("No se puede ingresar una cantidad negativa");
		}

		cuenta.ingresar(100);
		assertTrue(cuenta.getSaldo() == 100);

	}

	@Test
	public void retirarTest() throws Exception {
		try {
			cuenta.retirar(-1);
		} catch (Exception e) {
			fail("No se puede retirar una cantidad negativa");
		}

		cuenta.ingresar(100);
		cuenta.retirar(50);
		assertEquals(50, cuenta.getSaldo());
	}

	@Test
	public void ingresarTest2() {
		try {
			cuenta.ingresar(1);
			cuenta.retirar(-1);
			cuenta.getSaldo();
		} catch (Exception e) {
			fail("No se puede retirar una cantidad negativa");
			fail("Saldo insuficiente");
		}
		assertEquals(0, cuenta.getSaldo());
	}

	@Test
	public void getSaldoTest() throws Exception {
		cuenta.ingresar(200.5);
		assertEquals(200.5, cuenta.getSaldo());
	}
}
