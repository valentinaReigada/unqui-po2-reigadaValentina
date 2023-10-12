package ar.edu.unq.po2.tp6.ej2;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{

	private Propiedad propiedad;
	//pondria los porcentajes como variables y le agregaria un set para que lo puedan cambiar.
	//eso ayudaria a que no sea tan rigido.
	//preguntar si está bien usar metodos de clientes para obtener datos.
	//podria poner metodos en solicitudDeCredito para obtener datos del cliente desde ahi, y aca solo llamar al metodo ? quedaria mejor o no ?
	//lo mismo para los datos de propiedad
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, Integer plazos, Propiedad propiedad) {
		super(cliente, monto, plazos);
		this.propiedad	=	propiedad;		
	}

	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	
	@Override
	public Boolean esAceptable() {
		return this.cumpleCuotasSegunIngresosMensuales() &&
			   this.cumpleMontoSegunValorFiscal() &&
			   this.cumpleRequisitoDeEdad();
	}
	
	public Boolean cumpleCuotasSegunIngresosMensuales() {
		Double porcentajeIngreso = this.getCliente().getSueldoNeto() * 0.5;
		return this.montoDeCuota() < porcentajeIngreso;
	}
	
	public Boolean cumpleMontoSegunValorFiscal() {
		Double porcentajeGarantia = this.getPropiedad().getValorFiscal() * 0.7;
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





