package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtrasTestCase {

	private IngresoPorHorasExtras ingreso;
	
	
	@BeforeEach
	public void setUp() {
		ingreso = new IngresoPorHorasExtras("enero", "reboque", 300d, 20);
	}
	
	
	@Test
	void verificoQueTengoUnIngresoEnElMesDeEnero() {
		assertEquals("enero", ingreso.getMes());
	}
	
	@Test
	void verificoQueTengoUnIngresoDe300() {
		assertEquals(300d, ingreso.getMonto());
	}
	
	@Test
	void verificoQueTengoUnIngresoCon20hsExtras() {
		assertEquals(20, ingreso.getCantHorasExtras());
	}
	
	@Test
	void verificoQueMiMontoImponibleEs0() {
		assertEquals(0, ingreso.montoImponible());
	}
	
}
