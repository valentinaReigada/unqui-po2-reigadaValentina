package ar.edu.unq.po2.tp7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LesionesDermatologicasTestCase {

	private LesionesDermatologicas lesion;
	private LesionesDermatologicas lesionA;
	
	
	@Test
	public void validoQueProximoNivelDeMielEsRojo() {
		LesionesDermatologicas lesionMiel = lesion.MIEL;
		
		assertEquals(lesionMiel.getProxNivel(),lesionA.ROJO);
	}
	
	
}
