package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDelDeporteTestCase {
	private ActividadSemanal actividadA;
	private ActividadSemanal actividadB;
	private ActividadSemanal actividadC;
	private	Deporte deporteA;
	private	Deporte deporteB;
	private DiaDeLaSemana dia;
	private DiaDeLaSemana diaB;
	private SecretariaDelDeporte secretaria;
	private List<ActividadSemanal> actividades;
	
	@BeforeEach
	public void setUp() {
		actividadA	= new ActividadSemanal(dia.LUNES, 13, 2, deporteA.FUTBOL);
		actividadC	= new ActividadSemanal(dia.DOMINGO, 11, 1, deporteA.FUTBOL);
		actividadB	= new ActividadSemanal(dia.VIERNES, 13, 4, deporteA.TENNIS);	
		actividades = new ArrayList<ActividadSemanal>();
		actividades.add(actividadA);
		actividades.add(actividadB);
		secretaria  = new SecretariaDelDeporte(actividades);
	}
	
	
	@Test
	void verificoQueLaSecretariaNoTieneActividadesRegistradas() {
		assertTrue(secretaria.getActividades().size() == 0);	
	}

	@Test
	void agrego2ActividadesASecretariaYVerificoQueFueronInsertadas() {
		assertEquals(secretaria.getActividades().size(), 2);
	}
	
	@Test
	void eliminoUnaActividadDeSecretariaYVerificoQueNoExista() {
		secretaria.eliminarActividad(actividadB);
		assertFalse(secretaria.getActividades().contains(actividadB));
	} 
	
	
	@Test
	void validoQueSecretariaTieneSoloUnaActividadDeFutbolEnSuLista() {
		assertEquals(secretaria.todasLasActividadesDeFutbol().size(), 1);
	}
	
	@Test 
	void verificoQueSecretariaTieneUnaActividadConComplejidad2EnLaLista() {
		assertEquals(secretaria.todasLasActividadesDeComplejidad(2).size(), 1);
	}
	
	@Test
	void verificoQueLaCantidadDeHorasEnActividadesEs6() {
		assertTrue(secretaria.cantHorasDeActividades() == 6);
	}
	
	@Test
	void verificoQueSecretariaTieneLaActividadAConMenorCosto() {
		secretaria.agregarActividad(actividadC);
		assertEquals(secretaria.getActividades().size(), 3);
		assertEquals(secretaria.actividadDeMenorCostoDe(deporteA.FUTBOL), actividadA);
	}
	
	
}





