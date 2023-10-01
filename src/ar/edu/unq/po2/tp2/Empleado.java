package ar.edu.unq.po2.tp2;

import java.time.LocalDate;


public abstract class Empleado {
	private String	nombre;
	private String	direccion;
	private String	estadoCivil;
	private Double	sueldoBasico;
	private LocalDate fechaNacimiento;
	
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, Double sueldoBasico ) {
		this.nombre			 =	nombre;
		this.direccion		 =	direccion;
		this.estadoCivil     =	estadoCivil;
		this.sueldoBasico	 =	sueldoBasico;
		this.fechaNacimiento =	fechaNacimiento;
	}
	
	//SETER Y GETTER;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public Double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public void setNombre(String nombre) {
		this.nombre	=	nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion	=	direccion;

	}
	
	public void setEstadoCivil(String estado) {
		this.estadoCivil	=	estado;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento	=	fecha;
	}
	
	public void setSueldoBasico(Double sueldo) {
		this.sueldoBasico	=	sueldo;
	}
	
	public Integer edad() {
		LocalDate fechaActual = LocalDate.now();
		int diferencia = fechaActual.getYear() - this.fechaNacimiento.getYear();
		return diferencia;
	}
	
	public Double retencionDelSueldoBruto(Double cantidad) {
		return this.sueldoBruto() * cantidad;
	}
	
	public  Double sueldoNeto() {
			return this.sueldoBruto() - this.retenciones();
	};

	public abstract Double sueldoBruto();
	public abstract Double retenciones();
		
}
