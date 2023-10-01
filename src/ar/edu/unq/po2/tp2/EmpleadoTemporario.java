package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	private Integer cantHorasExtras;
	private LocalDate fechaFin;
	private Double plusPorHorasExtras = 40.00;
	private Double retencionPorEdad = 25.00;
	private Double retencionDelBruto = 0.10;
	private Double retencionPorHorasExtras = 5.0;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, Double sueldoBasico, Integer cantHorasExtras, LocalDate fechaFin) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantHorasExtras	=	cantHorasExtras;
		this.fechaFin			=	fechaFin;
	}

	//SETTER Y GETTER
	
	public Integer getCantHorasExtras() {
		return this.cantHorasExtras;
	}
	
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}
	
	public void setCantHorasExtras(Integer cantidad) {
		this.cantHorasExtras	+=	cantidad;
	}
	
	public void setFechaFin(LocalDate fecha) {
		 this.fechaFin	=	fecha;
	}
	

	//MÉTODOS A IMPLEMENTAR:::::
	
	@Override
	public Double sueldoBruto() {
		return this.getSueldoBasico()  + (this.cantHorasExtras * this.plusPorHorasExtras) ;
	}

	@Override
	public Double retenciones() {
		return this.retencionPorObraSocial() + this.retencionPorAportes();
	}

	
	//MÉTODOS AUX::
	
	public void setPlusPorHorasExtras(Double plusPorHorasExtras) {
		this.plusPorHorasExtras = plusPorHorasExtras;
	}

	public void setRetencionPorHorasExtras(Double retencionPorHorasExtras) {
		this.retencionPorHorasExtras = retencionPorHorasExtras;
	}

	public void setRetencionDelBruto(Double retencionDelBruto) {
		this.retencionDelBruto = retencionDelBruto;
	}

	public void setRetencionPorEdad(Double retencionPorEdad) {
		this.retencionPorEdad = retencionPorEdad;
	}
	
	private Double retencionPorEdad() {
		return this.edad() > 50 ? this.retencionPorEdad : 0;
	}

	private Double retencionPorAportes() {
		return this.retencionDelSueldoBruto(this.retencionDelBruto) + (this.retencionPorHorasExtras * this.cantHorasExtras);
	}

	private Double retencionPorObraSocial() {
		return this.retencionDelSueldoBruto(retencionDelBruto) + this.retencionPorEdad();
	}


}
