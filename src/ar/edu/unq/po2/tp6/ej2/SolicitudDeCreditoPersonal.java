package ar.edu.unq.po2.tp6.ej2;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(Cliente cliente, Double monto, Integer plazos) {
		super(cliente, monto, plazos);
	}

	@Override
	public Boolean esAceptable() {
		return this.cumplePorIngresosAnuales() && this.cumpleCuotasSegunIngresosMensuales();
	}
	
	public Boolean cumplePorIngresosAnuales() {
		return this.getCliente().sueldoNetoAnual() > 1500;
	}
	
	public Boolean cumpleCuotasSegunIngresosMensuales() {
		Double porcentajeIngreso = this.getCliente().getSueldoNeto() * 0.7;
		return this.montoDeCuota() < porcentajeIngreso;
	}
	

}
