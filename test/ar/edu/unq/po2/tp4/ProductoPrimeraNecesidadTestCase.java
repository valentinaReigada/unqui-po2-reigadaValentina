package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesidadTestCase {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		double porcentaje = 8;
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, porcentaje);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.36, leche.getPrecio());
	}

}
