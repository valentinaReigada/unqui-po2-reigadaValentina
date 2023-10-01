package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio; 
	private Boolean esPrecioCuidado;
	
	public Producto(String nombre, Double precio) {
		this.nombre	=	nombre;
		this.precio	=	precio;
		this.esPrecioCuidado	=	false;
	}
	
	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		this.nombre	=	nombre;
		this.precio	=	precio;
		this.esPrecioCuidado	=	esPrecioCuidado;
	}
	
	//SETTER Y GETTER:::
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(Double precio) {
		this.precio	=	precio;
	}
	
	public void setAsociadoAlPrograma(Boolean esPrecioCuidado) {
		this.esPrecioCuidado	=	esPrecioCuidado;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(Double numero) {
		this.precio += numero;
	}
	
}
