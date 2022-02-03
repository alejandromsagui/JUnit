package es.iessoterohernandez.daw.endes.PruebaJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EmpleadoTest {

	static Empleado empleado;

	@ParameterizedTest(name = "plusTest")
	@CsvSource({ "1500, 40, false", "900, 20, false", "2000, 60, true" })
	void withCsvSource(double sueldo, int edad, String resultado) {
	}

	public void plusTest(double sueldo, int edad, String resultado) {
		assertEquals(resultado, empleado.plus(sueldo));

	}

	@ParameterizedTest(name = "equalTest")
	@CsvSource({ "Alejandro, Maeso Aguilera, true", "Alejandro, Maeso Aguilera, true",
			"Pepe, Rodríguez Flores, false" })
	void withCsvSource(String nombre, String apellidos, String resultado) {
	}

	public void equalTest(String nombre, String apellidos, String resultado) {
		assertEquals(resultado, empleado.equals(empleado));

	}

	@ParameterizedTest(name = "compareTo")
	@CsvSource({ "18, true", "16, false", "20, true" })
	void withCsvSource(int edad, String resultado) {
	}

	public void compareToTest(int edad, String resultado) {
		assertEquals(resultado, empleado.compareTo(empleado));

	}

}
