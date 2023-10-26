package ar.edu.unq.po2.tp9.Patrones;

public class EmpleadoPasante extends Empleado{
	private Integer cantHorasTrabajadas;
	private Double precioPorHora;
	
	
	public EmpleadoPasante(Integer legajo, Integer cantHijos, Integer descuentoPorAportes, Integer horasTrabajadas, Double precioPorHora) {
		super(legajo, cantHijos, descuentoPorAportes, 0d);
		this.cantHorasTrabajadas = horasTrabajadas;
		this.precioPorHora = precioPorHora;
	}
	
	public void setPrecioPorHora(Double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	
	@Override
	public Double montoPorHorasTrabajadas() {
		return this.cantHorasTrabajadas * this.precioPorHora;
	}

}
