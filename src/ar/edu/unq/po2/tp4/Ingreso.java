package ar.edu.unq.po2.tp4;

public class Ingreso {
	private	String mes;
	private String concepto;
	private Double monto;
	
	public Ingreso(String mes, String concepto, Double monto) {
		this.mes 		= mes;
		this.concepto	= concepto;
		this.monto		= monto;
	}
	
	//SETTER Y GETTER:::
	
	public void setMes(String mes) {
		this.mes	=	mes;
	}
	
	public void setConcepto(String concepto) {
		this.concepto	=	concepto;
	}
		
	public void setMonto(Double monto) {
		this.monto	=	monto;
	}
	
	public Double getMonto() {
		return this.monto;
	}
	
	public String getMes() {
		return this.mes;
	}
	
	public Double montoImponible() {
		return this.monto;
	}
	
	
}
