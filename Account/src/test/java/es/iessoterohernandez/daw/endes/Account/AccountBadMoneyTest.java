package es.iessoterohernandez.daw.endes.Account;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountBadMoneyTest {

	static Account cuenta;

	@BeforeEach
	public void inicio() {
		cuenta = new Account("Alejandro", 45321, 33234f);
	}

	@Test
	public void ejemplo1() {
		float originalPrice = 400000.00f;
		// to make the price more attractive, we'll reduce it to $399999.95
		float reducedPrice = originalPrice - 0.05f;
		float discount = originalPrice - reducedPrice;
		// Display discount amount
		System.out.println("Discount is: " + discount);

		assertEquals(399999.95, reducedPrice); /* Todo el test va a fallar por la inexactitud del float */
	}

	@Test
	public void ejemplo2() {
		float principal = 12345678.12f;
		int count; // count number of iterations
		NumberFormat fmt = NumberFormat.getCurrencyInstance(); // for output formatting.

		// Display the original amount
		System.out.println("The original principal is " + fmt.format(principal) + ".");
		assertEquals(NumberFormat.getCurrencyInstance(), fmt.format(principal));

		// Add a dime to the principal a thousand times
		for (count = 1; count <= 1000; count = count + 1) {
			principal = principal + .10f;

			assertEquals(principal + 10f, principal);
		}

		// The result should be 100 dollars larger.
		System.out.println("The new principal is " + fmt.format(principal) + ".");

		assertEquals(100l, fmt.format(principal));
	}

	@Test
	public void ejemplo3() {
		double FloatNumber = 4.35;
		int IntegerNumber = (int) (100 * FloatNumber);
		System.out.println("Computation result is " + IntegerNumber);

		assertEquals((int) (FloatNumber), IntegerNumber);
	}
}
