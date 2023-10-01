package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
		
	private String 	nombreEmpleado;
	private String 	direccionEmpleado;
	private Double 	sueldoBrutoEmpleado;
	private Double 	retencionesEmpleado;
	private Double 	sueldoNetoEmpleado;
	private LocalDate 	fechaEmision;
	private String 		concepto;
	
	public ReciboDeHaberes(Empleado empleado) {
		this.setNombreEmpleado(empleado.getNombre());
		this.setDireccionEmpleado(empleado.getDireccion());
		this.sueldoBrutoEmpleado =	empleado.sueldoBruto();
		this.retencionesEmpleado =  empleado.retenciones();
		this.setSueldoNetoEmpleado(empleado.sueldoNeto());
		this.setFechaEmision(LocalDate.now());
		this.concepto	=  this.generarConcepto();
	}
	
	public String generarConcepto() {
	    String conceptoA = "SUELDO BRUTO: " + this.sueldoBrutoEmpleado.toString() + "/n";
	    String conceptoB = "RETENCIONES: "  + this.retencionesEmpleado.toString() + "/n";
	    String conceptoC = "SUELDO NETO: "  + this.getSueldoNetoEmpleado().toString() + "/n";
		return conceptoA + conceptoB + conceptoC;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public Double getSueldoNetoEmpleado() {
		return sueldoNetoEmpleado;
	}

	public void setSueldoNetoEmpleado(Double sueldoNetoEmpleado) {
		this.sueldoNetoEmpleado = sueldoNetoEmpleado;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getConcepto() {
		return concepto;
	}
	

}
