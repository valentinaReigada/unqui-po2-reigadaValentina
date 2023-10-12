package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.List;

public class Sistema {
	
	private List<Producto> listaDeProductos;
	private HashMap<String, Integer> stock;
	
	public Sistema(List<Producto> productos, HashMap<String, Integer> stock) {
		this.listaDeProductos	=	productos;
		this.stock	=	stock;
	}
	
	public List<Producto> getProductos() {
		return this.listaDeProductos;
	}
	
	public HashMap<String, Integer> getStock(){
		return this.stock;
	}
	
	public void agregarStock(Producto producto, Integer cantidad) {
		//Agrega stock del producto a la lista.
		stock.put(producto.getNombre(), cantidad);
	}
	
	public void actualizarStockDe(Producto producto, Integer cantidad) { //cantidad puede ser un número negativo
		//actualiza la cantidad de stock del producto dado, siendo positiva o negativa la cantidad.
		Integer cantidadActualizada = this.stockDeProducto(producto) + cantidad;
		this.agregarStock(producto, cantidadActualizada);
	}
	
	public Double registrarProducto(Producto producto, Integer cantidad) {
		int cant = cantidad * (-1);
		this.actualizarStockDe(producto, cant);
		return producto.getPrecio();
	}
	
	public Double cobrarProductos(List<Producto> productos) {
		Double montoTotal = 0d;
		for (Producto producto : productos){
			montoTotal += this.registrarProducto(producto, 1);
		}		
		return montoTotal;
	}
	
	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}
	
	public void eliminarProducto(Producto producto) {
		if(this.listaDeProductos.contains(producto)){
			int index = this.listaDeProductos.indexOf(producto);
			this.listaDeProductos.remove(index);
		}	
	}
	
	public Integer stockDeProducto(Producto producto) {
		return this.getStock().get(producto.getNombre());
	}
	
}
