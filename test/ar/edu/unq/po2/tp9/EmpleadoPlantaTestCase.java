package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp9.Patrones.EmpleadoPlanta;

public class EmpleadoPlantaTestCase {
	
	private EmpleadoPlanta empleado;
	
	@BeforeEach
	public void setUp(){//SETUP
		empleado = new EmpleadoPlanta(1, 1, 13, 3000d,150d);
	}
	
	
	@Test
	void verificoQueElPlusPorHijosEs150() {
		assertEquals(empleado.montoPorPlusHijos(), 150d);
	}
	
	@Test
	void verificoQueElSueldoDelEmpleadoEs174() {
		assertEquals(empleado.sueldo(), 2740.5d);
	}
	
}
