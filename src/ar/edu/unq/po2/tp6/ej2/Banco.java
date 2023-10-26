package ar.edu.unq.po2.tp6.ej2;

import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudesDeCredito;
	
	
	public Banco(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Cliente> getClientes(){
		return this.clientes;
	}
	
	public List<SolicitudDeCredito> getSolicitudes(){
		return this.solicitudesDeCredito;
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		this.solicitudesDeCredito.add(solicitud);
	}

	public void eliminarCliente(Cliente cliente) {
		if(this.clientes.contains(cliente)) {
			Integer index = this.clientes.indexOf(cliente);
			this.clientes.remove(index);
		}
	}
	
	public void eliminarSolicitud(SolicitudDeCredito solicitud) {
		if(this.solicitudesDeCredito.contains(solicitud)) {
			Integer index = this.solicitudesDeCredito.indexOf(solicitud);
			this.solicitudesDeCredito.remove(index);
		}
	}
	
	public void solicitarPrestamo(SolicitudDeCredito solicitud) {
		this.agregarSolicitud(solicitud);
	}
	
	
	public Double montoTotalADesembolsar() {
		return this.getSolicitudes().stream().filter(sol -> sol.esAceptable()).mapToDouble(sol -> sol.getMonto()).sum();
	}
	
}
