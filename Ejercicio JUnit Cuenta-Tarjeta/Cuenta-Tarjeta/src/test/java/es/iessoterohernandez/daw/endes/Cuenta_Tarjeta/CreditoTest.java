package es.iessoterohernandez.daw.endes.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoTest {

	static Cuenta cuenta;
	static Credito credito;

	@BeforeEach
	public void inicio() throws ParseException {
		cuenta = new Cuenta("IES456325", "Alejandro");

		DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		String caduca = "19/10/2025";
		Date extension = formatoFecha.parse(caduca);
		Date fechaCaducidad = new Date(extension.getTime());
		
		credito = new Credito("3456234", "Alejandro", fechaCaducidad, 200);
	}
	
	@Test
	public void retirarTest() throws Exception{
		try {
			credito.retirar(300);  /*Muchos tests darán fallos por las excepciones*/
		}catch(Exception e) {
			fail("Crédito insuficiente");
		}
		
		cuenta.retirar(20);
		assertEquals(180, credito.getCreditoDisponible());
	}
	
	@Test
	public void ingresarTest() throws Exception{
		credito.ingresar(100);
		assertEquals(300, credito.getCreditoDisponible());
	}
	
	@Test
	public void pagoEnEstablecimientoTest() throws Exception {
		credito.pagoEnEstablecimiento("Auriculares", 30);
		assertEquals(170, credito.getSaldo());
		
	}
	
	@Test
	public void getSaldo() {
		assertEquals(200, credito.getSaldo());
	}
	
	
	
/*
 * 
 * Me da error este método 
 * 
	public void liquidar() {
		Movimiento m = new Movimiento();
		
		assertEquals(m.getFecha(), credito.liquidar(10, 2025));
	}
	*/
	
}
