package ar.edu.unq.po2.tp5;

public abstract class Producto {
	
	private String nombre;
	protected Double precio;
	
	public Producto(String nombre, Double precio) {
		this.nombre	=	nombre;
		this.precio	=	precio;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
}
