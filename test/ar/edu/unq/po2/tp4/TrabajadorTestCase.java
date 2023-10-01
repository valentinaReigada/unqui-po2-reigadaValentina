package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	private Trabajador trabajador;
	private Ingreso ingreso;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador("Valentina");
		ingreso    = new Ingreso("enero", "concepto", 300d);
	}
	
	
	@Test
	public void verificoQueElTrabajadorNoTieneIngresos() {
		assertEquals(0, trabajador.getIngresos().size());
	}
	
	@Test
	public void agregoUnIngresoYVerificoQueLaCantidadDeIngresosEs1() {
		trabajador.agregarIngreso(ingreso);
		assertEquals(1, trabajador.getIngresos().size());
	}
	
	
	@Test
	public void eliminoUnIngresoYVerificoQueLaListaYaNoLoTieneMas() {
		trabajador.agregarIngreso(ingreso);
		trabajador.eliminarIngreso(ingreso);
		assertFalse(trabajador.getIngresos().contains(ingreso));
	}
	
	@Test
	public void verificoQueElMontoTotalPercibidoEs300() {
		trabajador.agregarIngreso(ingreso);
		assertEquals(300d, trabajador.getTotalPercibido());
	}
	
	@Test
	public void verificoQueElMontoImponibleEs300() {
		trabajador.agregarIngreso(ingreso);
		assertEquals(300d, trabajador.getMontoImponible());
	}
	
	@Test
	public void verificoQueElImpuestoAPagarEs300() {
		trabajador.agregarIngreso(ingreso);
		assertEquals(60, trabajador.getImpuestoAPagar());
	}

}
