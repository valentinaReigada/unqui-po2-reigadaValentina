package ar.edu.unq.po2.tp6.ej2;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	private Double porcentajeIngresoMensual;
	private Propiedad propiedad;
	private Double porcentajeValorFiscal;
	//pondria los porcentajes como variables y le agregaria un set para que lo puedan cambiar.
	//eso ayudaria a que no sea tan rigido.
	//preguntar si está bien usar metodos de clientes para obtener datos.
	//podria poner metodos en solicitudDeCredito para obtener datos del cliente desde ahi, y aca solo llamar al metodo ? quedaria mejor o no ?
	//lo mismo para los datos de propiedad
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, Integer plazos, Propiedad propiedad, Double porcentajeIngreso, Double porcentajeFiscal) {
		super(cliente, monto, plazos);
		this.propiedad	=	propiedad;		
		this.porcentajeIngresoMensual = porcentajeIngreso;
		this.porcentajeValorFiscal 	  = porcentajeFiscal;
	}

	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	
	public void setPorcentajeIngresoMensual(Double porcentaje) {
		this.porcentajeIngresoMensual = porcentaje;
	}
	
	
	public void setPorcentajeFiscal(Double porcentaje) {
		this.porcentajeValorFiscal = porcentaje;
	}
	
	
	@Override
	public Boolean esAceptable() {
		return this.cumpleCuotasSegunIngresosMensuales() &&
			   this.cumpleMontoSegunValorFiscal() &&
			   this.cumpleRequisitoDeEdad();
	}
	
	public Boolean cumpleCuotasSegunIngresosMensuales() {
		Double porcentajeIngreso = this.getCliente().getSueldoNeto() * this.porcentajeIngresoMensual;
		return this.montoDeCuota() < porcentajeIngreso;
	}
	
	public Boolean cumpleMontoSegunValorFiscal() {
		Double porcentajeGarantia = this.getPropiedad().getValorFiscal() * this.porcentajeValorFiscal;
		return this.montoDeCuota() < porcentajeGarantia;
	}
	
	public Boolean cumpleRequisitoDeEdad() {
		Integer plazosEnAnios  = Math.round(this.getPlazos() / 12);
		Integer aniosQueTendra = this.getCliente().getEdad();
		if (plazosEnAnios > 0) {
			aniosQueTendra += plazosEnAnios;
		}
		return aniosQueTendra < 65;
	}
}





