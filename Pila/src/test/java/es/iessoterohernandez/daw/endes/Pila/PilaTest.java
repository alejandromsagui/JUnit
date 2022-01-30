package es.iessoterohernandez.daw.endes.Pila;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PilaTest {

	static Pila pila;

	@BeforeEach
	public void inicio() {
		pila = new Pila(); /* Creo la pila para no crearla cada vez en cada método a realizar la prueba */
	}

	@Test
	public void pushTest() {
		pila.push(1); /* Como el número debe ser mayor que 2, la pila estará vacía */
		assertEquals(true, pila.isEmpty());

		pila.push(15);
		assertEquals(false, pila.isEmpty()); /*
												 * Como el número debe ser mayor que 2 y menor que 20, si añado 15 la
												 * pila no está vacía
												 */

	}

	@Test
	public void popTest() {
		assertEquals(null, pila.pop()); /* La pila está vacía, así que devuelve null */

		pila.push(4);
		assertEquals(4, pila.pop()); /* Este test devuelve el último número añadido a la pila */

		pila.push(10);
		assertEquals(10, pila.pop());
	}

	/*
	 * El método isEmpty se probó, a su vez, en el pushTest, así que vi redundante
	 * repetirlo
	 */

	@Test
	public void topTest() {
		assertEquals(null, pila.top()); /* Devuelve null al estar la pila vacía */

		pila.push(8);
		pila.push(15);
		pila.push(19);

		assertEquals(19, pila.top());
	}

}
