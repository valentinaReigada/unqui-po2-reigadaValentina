package ar.edu.unq.po2.tp7;

public class ActividadSemanal {
	private DiaDeLaSemana dia;
	private Integer horaDeInicio;
	private Integer duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, Integer horaDeInicio, Integer duracion, Deporte deporte) {
		this.dia = dia;
		this.horaDeInicio  = horaDeInicio;
		this.duracion      = duracion;
		this.deporte	   = deporte;
	}
	
	public void setHoraDeInicio(Integer hora) {
		this.horaDeInicio = hora;
	}
	
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public Deporte getDeporte() {
		return this.deporte;
	}
	
	public DiaDeLaSemana getDiaDeLaSemana() {
		return this.dia;
	}
	
	public Integer getDuracion() {
		return this.duracion;
	}
	
	
	public Integer costoActividad() {
		return this.costoPorDia() + this.costoPorComplejidadDelDeporte();
	}
	
	public Integer costoPorDia() {
		Integer costo = 0;
		if (this.dia == DiaDeLaSemana.LUNES || this.dia == DiaDeLaSemana.MARTES || this.dia == DiaDeLaSemana.MIERCOLES ) {
			costo = 500;
		}else {
			costo = 1000;
		}
		return costo;
	}
	
	public Integer costoPorComplejidadDelDeporte() {
		return deporte.getComplejidad() * 200;
	}
	 
	
	@Override
	public String toString() {
		return "Deporte: " + deporte + ". Dia: "+ dia + " A LAS: " + horaDeInicio + ". Duración: " + duracion + "hora(s).";
	}
	
	
}
