package es.iessoterohernandez.daw.endes.Boa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class BoaTestParametrizado {

	static Boa boa;

	@ParameterizedTest(name = "isHealthyTest")
	@CsvSource({ "Blanca, 9, macarrones, false", "Paco, 3, granola bars, true", "Borja, 5, granola bars, true" })
	static void withCsvSource(String name, int length, String favoriteFood, boolean exp) {
	}

	public void isHealthyTest(String name, int length, String favoriteFood, boolean exp) {
		assertEquals(exp, boa.isHealthy());

	}

	@ParameterizedTest(name = "fitsInCageTest")
	@CsvSource({ "Blanca, 9, 12, lasaña, true", "Paco, 6, 2, granola bars, false", "Ana, 3, 6, galletas, true" })
	void withCsvSource(String name, int length, int cageLength, String favoriteFood, boolean exp) {
	}

	void fitsInCageTest(String name, int length, int cageLength, String favoriteFood, boolean exp) {
		assertEquals(exp, boa.fitsInCage(cageLength));

	}

}
