package ar.edu.unq.po2.tp6.ej2;

public class Cliente {
	private String  nombre;
	private String  apellido;
	private String  direccion;
	private Integer edad;
	private Double  sueldoNeto;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldoNeto) {
		this.nombre		=	nombre;
		this.apellido	=	apellido;
		this.direccion	=	direccion;
		this.edad		=	edad;
		this.sueldoNeto	=	sueldoNeto;
	}
	
	public Double getSueldoNeto() {
		return this.sueldoNeto;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public Integer getEdad() {
		return this.edad;
	}
	
	public Double sueldoNetoAnual() {
		return this.sueldoNeto * 12;
	}
	
}
