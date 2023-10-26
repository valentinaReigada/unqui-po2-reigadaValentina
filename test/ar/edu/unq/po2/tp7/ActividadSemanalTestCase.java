package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTestCase {

	private ActividadSemanal actividadA;
	private ActividadSemanal actividadB;
	private	Deporte deporteA;
	private	Deporte deporteB;
	private DiaDeLaSemana dia;
	private DiaDeLaSemana diaB;
	
	
	@BeforeEach
	public void setUp() {
		actividadA	=	new ActividadSemanal(dia.LUNES, 13, 2, deporteA.FUTBOL);
		actividadB	=	new ActividadSemanal(dia.VIERNES, 13, 2, deporteA.TENNIS);
	}
	
	@Test
	void verificoQueLaActividadAEsFutbolYEsElDiaLunes() {
		assertEquals(actividadA.getDeporte(), Deporte.FUTBOL);
		assertEquals(actividadA.getDiaDeLaSemana(), DiaDeLaSemana.LUNES);
	}
	
	@Test
	void verificoQueLaActividadBEsTennisYEsElDiaViernes() {
		assertEquals(actividadB.getDeporte(), Deporte.TENNIS);
		assertEquals(actividadB.getDiaDeLaSemana(), DiaDeLaSemana.VIERNES);
	}
	
	@Test
	void verificoQueElCostoDeLaActividadAEs900() {
		assertEquals(actividadA.costoActividad(), 900);
	}
	
	@Test
	void verificoQueElCostoDeLaActividadBEs900() {
		assertEquals(actividadB.costoActividad(), 1600);
	}
	
	@Test
	void imprimir() {
	//	System.out.println(actividadB.toString());
	}

}
