package es.iessoterohernandez.daw.endes.Account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	static Account cuenta;
	
	@BeforeEach
	public void inicio() {
		cuenta = new Account("Alejandro", 45321, 33234f);
	}
	
	@Test
	public void depositTest() {
		assertEquals(true, cuenta.deposit(48750f));
		assertEquals(false, cuenta.deposit(-1));
	}
	
	@Test
	public void withdrawTest() {
		assertEquals(false, cuenta.withdraw(-1, -2));
		assertEquals(true, cuenta.withdraw(20, 30));
	}
	
	@Test
	public void addInterestTest() {
		assertEquals(33234, cuenta.getBalance());
	}
	
	@Test 
	public void toStringTest() {
		String esperado = cuenta.getAccountNumber()+"Alejandro" + +cuenta.getBalance();
		assertEquals(esperado, cuenta.toString());
	}
}
