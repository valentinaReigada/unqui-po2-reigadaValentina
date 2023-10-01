package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> listaDeProductos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre		=	nombre;
		this.direccion	=	direccion;
		this.listaDeProductos	=	new ArrayList<Producto>();
	}
	
	//SETTER Y GETTER::
	 
	public void setNombre(String nombre) {
		this.nombre	=	nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion	=	direccion;
	}	
	
	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public List<Producto> getProductos(){
		return this.listaDeProductos;
	}
	
	
	public void eliminarProducto(Producto producto) {
		if (this.listaDeProductos.contains(producto)){
			int index	= this.listaDeProductos.indexOf(producto);
			this.listaDeProductos.remove(index);
		}
	}
	
	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public Double getPrecioTotal() {
		return this.listaDeProductos.stream().mapToDouble(produ -> produ.getPrecio()).sum();
	}
	
	
}











