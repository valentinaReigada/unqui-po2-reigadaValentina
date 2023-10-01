package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad  extends Producto {
	
	private Double porcentaje;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean asociadoAlPrograma, double porcentaje2) {
		super(nombre, precio, asociadoAlPrograma);
		this.porcentaje	=	porcentaje2;
	}
	
	public void setPorcentaje(Double porcentaje) {
		this.porcentaje	=	porcentaje;
	}
	
	public Double getPorcentaje() {
		return this.porcentaje;
	}
	
	@Override
	public Double getPrecio() {
		return this.getPrecio() - (this.getPrecio() * (getPorcentaje() / 100));
	} 
 
}
