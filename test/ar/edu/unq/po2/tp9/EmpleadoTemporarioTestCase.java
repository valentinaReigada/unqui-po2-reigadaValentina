package ar.edu.unq.po2.tp9;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.Patrones.*;

public class EmpleadoTemporarioTestCase {

	private EmpleadoTemporario empleado;
	
	@BeforeEach
	public void setUp(){//SETUP
		empleado = new EmpleadoTemporario(1, 1, 13, 1000d,100d,5,40d);
	}
	
	
	@Test
	void verifoQueElMontoPorHorasTrabajadasEs200() {
		assertEquals(empleado.montoPorHorasTrabajadas(), 200d);
	}
	
	@Test
	void verificoQueElPlusPorHijosEs100() {
		assertEquals(empleado.montoPorPlusHijos(), 100d);
	}
	
	
	@Test
	void verificoQueElSueldoDelEmpleadoEs1131() {
		assertEquals(empleado.sueldo(), 1131);
	}	
}















