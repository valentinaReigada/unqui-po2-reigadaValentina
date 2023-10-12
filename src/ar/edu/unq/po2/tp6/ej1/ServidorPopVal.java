package ar.edu.unq.po2.tp6.ej1;

import java.util.ArrayList;
import java.util.List;

public class ServidorPopVal implements IServidorInbox{

	@Override
	public List<CorreoGral> recibirNuevos(String nombre, String pass) {
		List<CorreoGral> retorno = new ArrayList<CorreoGral>();
		return retorno;
	}

	@Override
	public void enviar(CorreoGral correo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void conectar(String nombre, String pass) {
		// TODO Auto-generated method stub
		
	}

}
