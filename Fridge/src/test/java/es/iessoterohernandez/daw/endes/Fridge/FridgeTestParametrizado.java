package es.iessoterohernandez.daw.endes.Fridge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class FridgeTestParametrizado {

	static Fridge frigo;

	@ParameterizedTest(name = "putTest")
	@CsvSource({ "Chocolate, true", "Aceitunas, false", "Tarta, true", "Pinzas, false" })
	void withCsvSource(String item, String resultado) {
	}

	public void putTest(String item, String resultado) {
		assertEquals(resultado, frigo.put(item));

	}

	@ParameterizedTest(name = "containsTest")
	@CsvSource({ "Chocolate, true", "Aceitunas, false", "Tarta, true", "Pinzas, false" })
	void withCsvSoure(String item, String resultado) {
	}

	public void containsTest(String item, String resultado) {
		assertEquals(resultado, frigo.contains(item));
	}

	@ParameterizedTest(name = "takeTest")
	@CsvSource({ "Chocolate, true", "Aceitunas, false", "Tarta, true", "Pinzas, false" })
	void withCsvSoure1(String item, String resultado) {
	} /* Tuve que poner "withCsvSoure1 porque me daba error */

	public void takeTest(String item, String resultado) {
		try {
			frigo.take(item);
		} catch (NoSuchItemException e) {
			fail(item + " not found in the fridge");
		}
	}

}
