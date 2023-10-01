package ar.edu.unq.po2.tp2;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;


class EmpresaTestCase {
	
	private Empresa empresa;
	private EmpleadoTemporario empleado1;
	private EmpleadoPermanente empleado2;
	private EmpleadoContratado empleado3;
	private List<Empleado> empleados;
	private LocalDate fecha;
	@BeforeEach
	public void setUp() throws Exception{
		empleados 	=	new ArrayList<Empleado>();
		fecha		=	LocalDate.of(2001, 02, 14);
		empleado1	=	new EmpleadoTemporario("Valentina", "Sicilia", "SOLTERA", fecha, 300000d, 2, fecha);
		empleado2	=	new EmpleadoPermanente("Valentina", "Sicilia", "SOLTERA", fecha, 300000d, 0, 2);
		empleado3	=	new EmpleadoContratado("Valentina", "Sicilia", "SOLTERA", fecha, 300000d, 10, "EFECTIVO");
		empresa 	=	new Empresa("Valentina", "123311", empleados);
	}
	
	
	@Test
	public void verificoQueTengoUnaEmpresaCon0Empleados() {
		assertEquals(0, empresa.getEmpleados().size());
	}
	
	@Test
	public void agregoEmpleadoTemporarioYPermanenteAEmpresaYVerificoQueTenga3Empleados() {
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		assertEquals(3, empresa.getEmpleados().size());
	}
	
	@Test
	public void verificoQueElMontoTotalNetoADesembolsarEsMayorA400000d() {
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		assertTrue(empresa.montoTotalNeto() > 400000d);
	}
	
	@Test
	public void lanzoLiquidacionDeSueldoYVerificoQueTengo2ReciboDeHaberes() {
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.liquidarSueldos();
		assertEquals(empresa.getRecibos().size(), 2);
	}
	
	
	

}
