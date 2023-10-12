package ar.edu.unq.po2.tp6.ej2;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	public Propiedad(String descripcion, String direccion, Double valorFiscal) {
		this.descripcion 	=	descripcion;
		this.direccion		=	direccion;
		this.valorFiscal	=	valorFiscal;
	}
	
	public Double getValorFiscal() {
		return this.valorFiscal;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
}
