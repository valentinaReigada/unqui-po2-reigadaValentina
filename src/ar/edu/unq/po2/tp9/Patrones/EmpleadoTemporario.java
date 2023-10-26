package ar.edu.unq.po2.tp9.Patrones;

public class EmpleadoTemporario extends Empleado{
	private Integer cantHorasTrabajadas;
	private Double precioPorHora;
	private Double plus;
	
	
	public EmpleadoTemporario(Integer legajo, Integer cantHijos, Integer descuentoPorAportes, Double sueldoBasico, Double plus, Integer cantHorasTrabajadas, Double precioPorHora) {
		super(legajo, cantHijos, descuentoPorAportes, sueldoBasico);
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.precioPorHora = precioPorHora;
		this.sueldoBasico = sueldoBasico;
		this.plus = plus;
	}
	
	public void setPrecioPorHora(Double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	
	public void setPlus(Double plus) {
		this.plus = plus;
	}
	
	
	@Override
	public Double montoPorHorasTrabajadas() {
		return this.cantHorasTrabajadas * this.precioPorHora;
	}

	@Override
	public Double montoPorPlusHijos() {
		return this.plus;
	}
	
	
	
}
