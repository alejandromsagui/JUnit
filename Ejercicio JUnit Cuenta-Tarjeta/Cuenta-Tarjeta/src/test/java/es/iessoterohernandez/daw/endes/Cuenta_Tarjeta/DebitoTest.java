package es.iessoterohernandez.daw.endes.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	static Debito debito;

	@BeforeEach
	public void inicio() throws Exception {

		DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		String caduca = "19/10/2025";
		Date extension = formatoFecha.parse(caduca);
		Date fechaCaducidad = new Date(extension.getTime());

		debito = new Debito("445453", "Alejandro", fechaCaducidad);

	}

	@Test
	public void retirarTest() {
		try {
			debito.retirar(10);
		} catch (Exception e) {
			System.out.println("Retirada en cajero automático");
		}
	}

	@Test
	public void ingresarTest() {
		try {
			debito.ingresar(20);
		} catch (Exception e) {
			System.out.println("Ingreso en cajero automático");
		}
	}

	@Test
	public void pagoEnEstablecimientoTest() {
		try {
			debito.pagoEnEstablecimiento("Auriculares", 30);
		} catch (Exception e) {
			System.out.println("Compra en establecimientos");
		}
	}

}
