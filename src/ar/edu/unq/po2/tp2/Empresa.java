package ar.edu.unq.po2.tp2;
import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> listaDeEmpleados 		= new ArrayList<Empleado>();;
	private List<ReciboDeHaberes> listaDeRecibos	= new ArrayList<ReciboDeHaberes>();
	
	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		this.nombre	=	nombre;
		this.cuit	=	cuit;
		this.listaDeEmpleados	=	empleados;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.listaDeEmpleados.add(empleado);
	}
	
	public void agregarRecibo(ReciboDeHaberes recibo) {
		this.listaDeRecibos.add(recibo);
	}
	
	public List<Empleado> getEmpleados(){
		return this.listaDeEmpleados;
	}
	
	public List<ReciboDeHaberes> getRecibos(){
		return this.listaDeRecibos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCuit() {
		return this.cuit;
	}
	
	public void liquidarSueldos() {
		this.getEmpleados().forEach(e -> this.generarReciboAEmpleado(e));
		
	}
	
	public void generarReciboAEmpleado(Empleado empleado) {
		ReciboDeHaberes recibo = new ReciboDeHaberes(empleado);
		this.agregarRecibo(recibo);
	}
	
	
	public Double montoTotalNeto() {
		Double monto = this.getEmpleados().stream().mapToDouble(empleado -> empleado.sueldoNeto()).sum();
		return monto;	
	}
	
	public Double montoTotalBruto(){
		Double monto = this.getEmpleados().stream().mapToDouble(empleado -> empleado.sueldoBruto()).sum();
		return monto;	
		
	}
	
	public Double montoTotalRetenciones() {
		Double monto = this.getEmpleados().stream().mapToDouble(empleado -> empleado.retenciones()).sum();
		return monto;	
		
	}
	
}




