package ar.edu.unq.po2.tp7;

public enum Deporte {
	RUNNING(1),
	FUTBOL(2),
	BASKET(2),
	TENNIS(3),
	JABALINA(4); 
	
	private Integer complejidad;
	
	Deporte(Integer complejidad) {
		this.complejidad = complejidad;
	}
	
	public void setComplejidad(Integer complejidad) {
		this.complejidad	=	complejidad;
	}
	
	public Integer getComplejidad() {
		return this.complejidad;
	}
	
}
