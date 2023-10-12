package ar.edu.unq.po2.tp6.ej2;

public abstract class SolicitudDeCredito {
	private Double montoSolicitado;
	private Integer plazos;
	private Cliente cliente;
	
	public SolicitudDeCredito(Cliente cliente, Double monto, Integer plazos) {
		this.montoSolicitado = monto;
		this.plazos 		 = plazos;
		this.cliente 		 = cliente;
	}
	
	
	public Double getMonto() {
		return this.montoSolicitado;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setMonto(Double monto) {
		 this.montoSolicitado = monto;
	}
	
	public Integer getPlazos() {
		return this.plazos;
	}
	
	public void setPlazos(Integer plazos) {
		 this.plazos = plazos;
	}
	
	public Double montoDeCuota() {
		return this.montoSolicitado / this.plazos;
	}
	
	public abstract Boolean esAceptable();
	
	
}
