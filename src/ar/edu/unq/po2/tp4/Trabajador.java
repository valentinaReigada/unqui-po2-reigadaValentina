package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {
	
	private String nombre;
	private List<Ingreso> ingresos;
	
	public Trabajador(String nombre) {
		this.nombre = nombre;
		this.ingresos	=	new ArrayList<Ingreso>();
	}
	
	//SETTER Y GETTER:::
	
	public void setNombre(String nombre) {
		this.nombre	=	nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	public List<Ingreso> getIngresos(){
		return this.ingresos;
	}
	
	public void eliminarIngreso(Ingreso ingreso) {
		if (this.ingresos.contains(ingreso)) {
			int index = this.ingresos.indexOf(ingreso);
			this.ingresos.remove(index);		
		}
	}
	
	public Double getTotalPercibido() {
		Double total = this.ingresos.stream().mapToDouble(ingreso -> ingreso.getMonto()).sum();
		return total;
	}
	
	public Double getMontoImponible() {
		Double total = this.ingresos.stream().mapToDouble(ingreso -> ingreso.montoImponible()).sum();
		return total;
	}
	
	public Double getImpuestoAPagar() {
		Double total = this.getMontoImponible() * 0.2;
		return total;
	}
}
