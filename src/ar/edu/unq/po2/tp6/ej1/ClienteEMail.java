package ar.edu.unq.po2.tp6.ej1;

import java.util.ArrayList;

public class ClienteEMail {
	
	 ServidorPop servidor;//Principio inversion de dependencia: Depende de una clase concreta y no de abstracciones.
	 String nombreUsuario;
	 String passusuario;
	 ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;//dependen de clase Correo concreta, esto ata a que siempre sea ese correo el que se reciba.
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}
	/*rompe con el principio open close: no deja abierta la posibilidad de poder cambiar 
	la forma de correo, ata a que siempre sea ese tipo de correo que envia el cliente.
	rompe con el principio de unica responsabilidad, ya que se encargas de crear el correo y
	posteriormente enviarlo. */

}
