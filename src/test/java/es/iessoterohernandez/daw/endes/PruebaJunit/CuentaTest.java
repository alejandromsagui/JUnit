package es.iessoterohernandez.daw.endes.PruebaJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta cuenta;

	@BeforeEach
	public void inicio() {
		cuenta = new Cuenta("IES603945", "Alejandro");

	}

	@Test
	public void ingresarTest() throws IngresoNegativoException {
		try {
			cuenta.ingresar("Matrícula Universidad", -1);
		} catch (IngresoNegativoException e) {
			fail("No se puede ingresar una cantidad negativa");
		}

		cuenta.ingresar("Matrícula Universidad", 800);
		assertTrue(cuenta.getSaldo() == 800);
	}

	@Test
	public void retirarTest() throws IngresoNegativoException, SaldoInsuficienteException {
		try {
			cuenta.retirar("Paga extraordinaria", -1);
		} catch (IngresoNegativoException e) {
			fail("No se puede retirar una cantidad negativa");
		}

		try {
			cuenta.ingresar("Ahorros", 1000);
			cuenta.retirar("Retirada cajero", 9999999);
		} catch (SaldoInsuficienteException e) {
			fail("Saldo insuficiente");
		}

		cuenta.ingresar("Beca", 100);
		cuenta.retirar("Retirada cajero", 50);
		assertEquals(50, cuenta.getSaldo());
	}

	@Test
	public void getSaldoTest() throws Exception {
		cuenta.ingresar("Ahorros", 200.5);
		assertEquals(200.5, cuenta.getSaldo());
	}

}
