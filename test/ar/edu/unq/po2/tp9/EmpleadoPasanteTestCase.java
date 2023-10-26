package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.Patrones.EmpleadoPasante;


public class EmpleadoPasanteTestCase {
	
	private EmpleadoPasante empleado;
	
	@BeforeEach
	public void setUp(){//SETUP
		empleado = new EmpleadoPasante(1, 1, 13,5,40d);
	}
	
	@Test
	void verifoQueElMontoPorHorasTrabajadasEs200() {
		assertEquals(empleado.montoPorHorasTrabajadas(), 200d);
	}
	
	@Test
	void verificoQueElSueldoDelEmpleadoEs174() {
		assertEquals(empleado.sueldo(), 174);
	}
}
