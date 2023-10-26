package ar.edu.unq.po2.tp8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ar.edu.unq.po2.tp8.*;

public class PokerStatusMockTestCase {
	private PokerStatus juegoA;
	private Carta cartaA;
	private Carta cartaB;
	private Carta cartaC;
	private Carta cartaD;
	private Carta cartaE;
	
	
	@BeforeEach
	public void setUp(){//SETUP
		//setUp	
		cartaA	=	mock(Carta.class);
		cartaB	=	mock(Carta.class);
		cartaC	=	mock(Carta.class);
		cartaD	=	mock(Carta.class);
		cartaE	=	mock(Carta.class);
		//Test Double Instalation
		juegoA = new PokerStatus();
	}
	
	@Test
	public void verificoQueLaCartaAEsMayorACartaB() {
		when(cartaA.getValor()).thenReturn(4);
		when(cartaB.getValor()).thenReturn(1);
		assertTrue(cartaA.esSuperiorA(cartaB));
	}
	
	
	@Test
	public  void verificoQueElJuegoATieneTrio() {
		when(cartaA.getValor()).thenReturn(4);
		when(cartaB.getValor()).thenReturn(4);
		when(cartaC.getValor()).thenReturn(4);
		when(cartaD.getValor()).thenReturn(1);
		when(cartaE.getValor()).thenReturn(4);
		
		when(cartaA.getPalo()).thenReturn("C");
		when(cartaB.getPalo()).thenReturn("C");
		when(cartaC.getPalo()).thenReturn("C");
		when(cartaD.getPalo()).thenReturn("R");
		when(cartaE.getPalo()).thenReturn("C");
		
		when(cartaA.getColor()).thenReturn("ROJO");
		when(cartaB.getColor()).thenReturn("ROJO");
		when(cartaC.getColor()).thenReturn("ROJO");
		when(cartaD.getColor()).thenReturn("ROJO");
		when(cartaE.getColor()).thenReturn("ROJO");
		
		//Exercise
		String resultado = juegoA.verificar(cartaA, cartaB, cartaC, cartaD, cartaE);
			
		//Verify
		assertEquals(resultado, "POKER");
		
	}
	
	
	
	
}












