package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTestCase {

	private Ingreso ingreso;
	
	@BeforeEach
	public void setUp() {
		ingreso = new Ingreso("enero", "reboque", 300d);
	}
	
	@Test
	public void verificoQueMiMontoImponibleEsIgualAElMontoDelIngreso() {
		assertEquals(ingreso.getMonto(), ingreso.montoImponible());
	}

}
