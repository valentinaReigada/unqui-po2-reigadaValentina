package ar.edu.unq.po2.tp6.ej1;

import java.util.ArrayList;
import java.util.List;

public class ClienteEmailVal {
	private IServidorInbox servidor;
	private String nombreUsuario;
	private String passUsuario;
	private List<CorreoGral>inbox;
	private List<CorreoGral>borrados;
	
	public ClienteEmailVal(IServidorInbox servidor, String nombreUsuario, String pass){
		this.servidor		=	servidor;
		this.nombreUsuario	=	nombreUsuario;
		this.passUsuario	=	pass;
		this.inbox 			= 	new ArrayList<CorreoGral>();
		this.borrados 		= 	new ArrayList<CorreoGral>();
		this.conectar();
	}
	
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
	public void borrarCorreo(CorreoGral correo){
		this.inbox.remove(correo);
		this.borrados.add(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(CorreoGral correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}
	
	public void enviarCorreo(CorreoGral correo){
		this.servidor.enviar(correo);
	}
}
