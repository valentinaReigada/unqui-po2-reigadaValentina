package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	private Integer nroContrato;
	private String  medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, Integer nroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.setNroContrato(nroContrato);
		this.setMedioDePago(medioDePago);
	}

	@Override
	public Double sueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public Double retenciones() {
		return 50d;
	}

	public Integer getNroContrato() {
		return nroContrato;
	}

	public void setNroContrato(Integer nroContrato) {
		this.nroContrato = nroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

}
