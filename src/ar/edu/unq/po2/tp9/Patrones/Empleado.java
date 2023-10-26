package ar.edu.unq.po2.tp9.Patrones;

public abstract class Empleado {
	protected Integer legajo;
	protected Integer cantHijos;
	protected Integer descuentoPorAportes;
	protected Double  sueldoBasico;
	
	public Empleado(Integer legajo, Integer cantHijos, Integer descuentoPorAportes, Double sueldoBasico){
		this.legajo 			 = legajo;
		this.cantHijos 			 = cantHijos;
		this.descuentoPorAportes = descuentoPorAportes;
		this.sueldoBasico 		 = sueldoBasico;
	}
	
	public void setDescuento(Integer descuento) {
		this.descuentoPorAportes = descuento;
	}
	

	//metodo plantilla
	final public Double sueldo() {
		Double sueldoBruto  = this.sueldoBasico() + this.montoPorHorasTrabajadas() + this.montoPorPlusHijos();
		Double descuento = (sueldoBruto * this.descuentoPorAportes) / 100;
		return sueldoBruto - descuento;
	}
	
	public Double sueldoBasico() {
		return this.sueldoBasico;
	}
	
	public Double montoPorHorasTrabajadas() {//se puede sobreescrir en las subclases
		return 0d;
	}
	
	public Double montoPorPlusHijos() { //se puede sobreescrir en las subclases
		return 0d;
	}
	

}
