package ar.edu.unq.po2.tp5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTestCase {
	
	private ProductoDeCooperativa productoDeCooperativa;
	private ProductoTradicional productoTradicional;
	
	@BeforeEach
	public void setUp() {
		productoTradicional = new ProductoTradicional("Fideos", 10d);
		productoDeCooperativa = new ProductoDeCooperativa("Pure", 100d);
	}

	
	@Test
	void verificoQueElProductoTradicionalEsFideoYSuPrecioEs10() {
		assertEquals("Fideos", productoTradicional.getNombre());
		assertEquals(10d, productoTradicional.getPrecio());
	}
	
	@Test
	void verificoQueElProductoDeCooperativaEsPure() {
		assertEquals("Pure", productoDeCooperativa.getNombre());
	}
	
	@Test
	void verificoQueElProductoDeCooperativaAlAplicarleDescuentoDe10QuedaElPrecioDe90() {
		assertEquals(productoDeCooperativa.getPrecio(), 90d);
	}

}






