package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	private int cantidadDeHijos;
	private int antiguedad;
	private Double plusPorAntiguedad  = 50.00;
	private Double plusPorHijos  = 150.00;
	private Double plusConyugue  = 100.00;
	private Double retencionDelBrutoPorAportes = 0.15;
	private Double retencionDelBrutoPorObraSoc = 0.10;
	private Double retencionPorHijos = 20.00;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, Double sueldoBasico, Integer cantidadDeHijos, Integer antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadDeHijos	=	cantidadDeHijos;
		this.antiguedad			=	antiguedad;
	}
	
	//SETTER Y GETTER::
	
	public Integer getCantidadDeHijos() {
		return this.cantidadDeHijos;
	}
	
	public Integer getAntiguedad() {
		return this.antiguedad;
	}
	
	public void setAntiguedad(Integer cantidad) {
		this.antiguedad += cantidad;
	}
	
	public void setCantidadDeHijos(Integer cantidad) {
		this.cantidadDeHijos += cantidad;
	}

	//MÉTODOS A IMPLEMENTAR::::
	
	@Override
	public Double sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar() + this.salarioPorConyuge() + this.salarioPorAntiguedad();
	}


	@Override
	public Double retenciones() {
		return this.retencionPorObraSocial() + this.retencionPorAportes();
	}

	//MÉTODOS AUX::
	
	private Double salarioPorAntiguedad() {
		return  this.plusPorAntiguedad * this.getAntiguedad();
	}

	private Double salarioFamiliar() {
		return this.plusPorHijos * this.getCantidadDeHijos();
	}

	private Double salarioPorConyuge() {
		return this.getEstadoCivil() == "CASADO" || this.getEstadoCivil() == "CASADA"  ? this.plusConyugue : 0;
	}

	
	public void setPlusPorAntiguedad(Double monto) {
		this.plusPorAntiguedad = monto;
	}
	
	public void setPlusPorHijos(Double monto) {
		this.plusPorHijos = monto;
	}
	
	public void setPlusPorConyugue(Double monto) {
		this.plusConyugue = monto;
	}
	
	public void setRetencionPorHijos(Double retencionPorHijos) {
		this.retencionPorHijos = retencionPorHijos;
	}

	public void setRetencionDelBrutoPorObraSoc(Double retencionDelBruto) {
		this.retencionDelBrutoPorObraSoc = retencionDelBruto;
	}
	
	public void setRetencionDelBrutoPorAportes(Double retencionAportes) {
		this.retencionDelBrutoPorAportes = retencionAportes;
	}
	
	
	private Double retencionPorAportes() {
		return this.retencionDelSueldoBruto(this.retencionDelBrutoPorAportes);
	}

	private Double retencionPorHijos() {
		return this.retencionPorHijos * this.getCantidadDeHijos();
	}

	private Double retencionPorObraSocial() {
		return this.retencionDelSueldoBruto(this.retencionDelBrutoPorObraSoc) + this.retencionPorHijos();
	}



}
