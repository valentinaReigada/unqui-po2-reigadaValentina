package ar.edu.unq.po2.tp8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		String resultado = "NADA";
		List<Carta> mazo = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		if(this.tienePokerDe_(4, mazo)){
			resultado = "POKER";
		}else if(this.tienePokerDe_(3, mazo)) {
			resultado = "TRIO";
		}else if (this.tieneMazoColor(mazo)) {
			resultado = "COLOR";
		} 
		return resultado;
	}
	
	
	/*public String verificar(String c1, String c2, String c3, String c4, String c5) {
		String resultado = "NADA";
		List<String> mazo = Arrays.asList(c1, c2, c3, c4, c5);
		Collections.sort(mazo); //ordena en orden alfabético.
		
		if(this.tienePokerDe_(4, mazo)){
			resultado = "POKER";
		}else if(this.tienePokerDe_(3, mazo)) {
			resultado = "TRIO";
		}else if (this.tieneMazoColor(mazo)) {
			resultado = "COLOR";
		}
		
		return resultado;	
	}
*/
	private boolean tieneMazoColor(List<Carta> mazo) {
		String color  = mazo.get(0).getColor();
		Integer valor = mazo.get(0).getValor();
		return mazo.stream().allMatch(carta -> carta.getColor() == color && carta.getValor() == valor);
	} 
 
	private boolean tienePokerDe_(int nro, List<Carta> mazo) {
		long cantRepetidas = 0;
		
		for(Integer i = 0; cantRepetidas < nro && i < mazo.size(); i++) {
			Carta cartaActual = mazo.get(i);
			cantRepetidas = 0;
			cantRepetidas = mazo.stream().filter(carta -> this.tieneMismoPaloYValor(carta, cartaActual)).count();
										 /*.collect(Collectors.toList())
										 .size();*/
		}
		
		return cantRepetidas == nro;
	
	}
	
	
	public boolean tieneMismoPaloYValor(Carta carta1, Carta carta2) {
		return carta1.getValor() == carta2.getValor() && carta1.getPalo() == carta2.getPalo();
	}
	

}






