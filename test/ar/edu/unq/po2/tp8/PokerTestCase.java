package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerTestCase {
	private PokerStatus juegoA;
	private PokerStatus juegoB;
	private Carta cartaA;
	private Carta cartaB;
	private Carta cartaC;
	private Carta cartaD;
	private Carta cartaE;
	
	@BeforeEach
	public void setUp(){//SETUP
		juegoA = new PokerStatus();
		cartaA = new Carta(4, "C", "ROJO");
		cartaB = new Carta(4, "C", "ROJO");
		cartaC = new Carta(2, "C", "ROJO");
		cartaD = new Carta(1, "C", "ROJO");
		cartaE = new Carta(5, "R", "VERDE");
		
	}
	
	@Test
	public void verificoQueElJuegoATieneTrio() {
		String resultado = juegoA.verificar(cartaE, cartaD, cartaC, cartaB, cartaA);
		assertEquals(resultado, "TRIO");
	}
	
	@Test
	public void verificoQueElJuegoATienePOKER() {
		String resultado = juegoA.verificar(cartaE, cartaD, cartaC, cartaB, cartaA);
		assertEquals(resultado, "POKER");
	}

	@Test
	public void verificoQueLaCartaAEsMayorALaCartaD() {
		assertTrue(cartaA.esSuperiorA(cartaD));
	}
	
	@Test
	public void verificoQueLaCartaATieneMismoPaloALaCartaD() {
		assertTrue(cartaA.tieneElMismoPalo(cartaD));
	}
	
	//@Test
/*	void verificoQueElJuegoAGanoLaPartida() {
		//EXERCISE
		Boolean partidaGanada = juegoA.verificar("10P", "2D", "2D", "2D", "2D");
		//VERIFY
		assertTrue(partidaGanada);
	}*/
	
/*	@Test
	void verificoQueElJuegoTieneUnaJugadaConResultadoCOLOR() {
		String resultado = juegoA.verificar("2D", "2D", "2D", "2D", "2D");
		assertEquals(resultado, "COLOR");
	}
	
	@Test
	void verificoQueElJuegoTieneUnaJugadaConResultadoTRIO() {
		String resultado = juegoA.verificar("2D", "2D", "2D", "1R", "QD");
		assertEquals(resultado, "TRIO");
	}
	
	@Test
	void verificoQueElJuegoTieneUnaJugadaConResultadoPOKER() {
		String resultado = juegoA.verificar("2D", "2D", "2D", "10D", "2D");
		assertEquals(resultado, "POKER");
	}
*/	
	

}
