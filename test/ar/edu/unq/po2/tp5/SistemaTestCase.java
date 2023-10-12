package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.doubleThat;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTestCase {
	
	private Sistema sistema;
	private List<Producto> productos;
	private ProductoDeCooperativa productoDeCooperativa;
	private ProductoTradicional productoTradicional;
	private HashMap<String, Integer> stock;
	
	
	@BeforeEach
	public void setUp() {
		productos	=	new ArrayList<Producto>();
		productoTradicional = new ProductoTradicional("Fideos", 10d);
		productoDeCooperativa = new ProductoDeCooperativa("Pure", 100d);
		stock = new HashMap<String, Integer>();
		sistema	=	new Sistema(productos, stock);
	}
	
	
	@Test
	public void verificoQueElSistemaNoTieneProductosCargados() {
		assertEquals(0, sistema.getProductos().size());
	}
	
	
	@Test
	public void verificoQueElSistemaNoTieneStockDeProductos() {
		assertEquals(0, sistema.getStock().size());
	}

	
	@Test
	public void agrego2ProductosListaDeProductos() {
		sistema.agregarProducto(productoDeCooperativa);
		sistema.agregarProducto(productoTradicional);
		assertEquals(2, sistema.getProductos().size());
	}
	
	
	@Test
	public void agregoStockDeProductoFideos2CantidadesYVerificoStock() {
		sistema.agregarProducto(productoDeCooperativa);
		sistema.agregarStock(productoDeCooperativa, 2);
		assertEquals(2, sistema.stockDeProducto(productoDeCooperativa));
	}
	
	@Test
	public void registro1ProductoTradicionalQueTiene2DeStockYVerificoSuNuevoStock() {
		sistema.agregarProducto(productoTradicional);
		sistema.agregarStock(productoTradicional, 2);
		Double precio = sistema.registrarProducto(productoTradicional, 1);
		assertEquals(1, sistema.stockDeProducto(productoTradicional));

	}
	
	@Test
	public void cobro2ProductosYVerificoQueElMontoTotalEs100d() {
		sistema.agregarProducto(productoDeCooperativa);
		sistema.agregarProducto(productoTradicional);
		sistema.agregarStock(productoTradicional, 2);
		sistema.agregarStock(productoDeCooperativa, 2);
		productos.clear();
		productos.add(productoDeCooperativa);
		productos.add(productoTradicional);
		assertEquals(100d, sistema.cobrarProductos(productos));
	}

}











