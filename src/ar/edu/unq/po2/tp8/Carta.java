package ar.edu.unq.po2.tp8;

public class Carta {
	private Integer valor;
	private String palo;
	private String color; 
	
	public Carta(Integer valor, String palo, String color) {
		this.valor  = valor;
		this.palo	= palo;
		this.color	= color;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return this.palo;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public Boolean tieneElMismoPalo(Carta carta) {
		return this.palo == carta.getPalo();
	}
	
	public Boolean esSuperiorA(Carta carta) {
		return this.getValor() > carta.getValor();
	}
	

}






