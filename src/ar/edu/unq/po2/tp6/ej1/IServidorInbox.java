package ar.edu.unq.po2.tp6.ej1;

import java.util.List;

public interface IServidorInbox {
	
	public List<CorreoGral> recibirNuevos(String nombre, String pass);
	public void enviar(CorreoGral correo);
	public void conectar(String nombre, String pass);

}
