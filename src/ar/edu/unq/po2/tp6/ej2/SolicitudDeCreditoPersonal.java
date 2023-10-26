package ar.edu.unq.po2.tp6.ej2;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {
	private Double porcentajeIngresosMensual;
	
	public SolicitudDeCreditoPersonal(Cliente cliente, Double monto, Integer plazos, Double porcentaje) {
		super(cliente, monto, plazos);
		this.porcentajeIngresosMensual = porcentaje;
	}

	
	public void setPorcentajeIngresosMensual(Double porcentaje) {
		this.porcentajeIngresosMensual = porcentaje;
	}
	
	
	@Override
	public Boolean esAceptable() {
		return this.cumplePorIngresosAnuales() && this.cumpleCuotasSegunIngresosMensuales();
	}
	
	public Boolean cumplePorIngresosAnuales() {
		return this.getCliente().sueldoNetoAnual() > 1500;
	}
	
	public Boolean cumpleCuotasSegunIngresosMensuales() {
		Double porcentajeIngreso = this.getCliente().getSueldoNeto() * this.porcentajeIngresosMensual;
		return this.montoDeCuota() < porcentajeIngreso;
	}
	

}
