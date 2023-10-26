package ar.edu.unq.po2.tp9.Patrones;

public class EmpleadoPlanta extends Empleado{
	private Double plusPorHijos; 
	
	public EmpleadoPlanta(Integer legajo, Integer cantHijos, Integer descuentoPorAportes, Double sueldoBasico, Double plusPorHijos) {
		super(legajo, cantHijos, descuentoPorAportes, sueldoBasico);
		this.sueldoBasico = sueldoBasico;
		this.plusPorHijos = plusPorHijos;
	}

	public void setPlusPorHijos(Double plus) {
		this.plusPorHijos = plus;
	}
	
	public Double getPlusHijos() {
		return this.plusPorHijos;
	}
	
	@Override
	public Double montoPorPlusHijos() {
		return this.cantHijos * this.getPlusHijos();
	}
	
}
