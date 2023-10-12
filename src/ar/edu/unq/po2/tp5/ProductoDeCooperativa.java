package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {
	private double descuento = 10d;
	
	public ProductoDeCooperativa(String nombre, Double precio) {
		super(nombre, precio);
	}
	
	@Override
	public Double getPrecio() {
		return this.precio -(this.precio * this.descuento) / 100;
	} 

}
