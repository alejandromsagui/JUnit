package es.iessoterohernandez.daw.endes.PruebaJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	static Movimiento mov;
	@BeforeEach
	public void inicio() {
		mov = new Movimiento();
	}
	
	@Test
	public void getImporte() {
		mov.setImporte(500.50);
		assertEquals(500.50, mov.getImporte());
	}
	
	@Test
	public void getConceptoTest() {
		mov.setConcepto("Beca Universidad 2022");
		assertEquals("Beca Universidad 2022", mov.getConcepto());
	}
	
	@Test
	public void getImporteTest() {
		mov.setImporte(0);
	}

}
