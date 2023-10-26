package ar.edu.unq.po2.tp7;

public enum LesionesDermatologicas {
	ROJO("ROJO", 1),
	GRIS("GRIS", 2),
	AMARRILLO("AMARRILLO", 3),
	MIEL("MIEL", 4);
	
	private String  descripcion;
	private LesionesDermatologicas  proxNivel;
	private Integer nivelRiesgo;
	
	LesionesDermatologicas(String descripcion, int nivelRiesgo) {
		this.descripcion	= descripcion;
		this.nivelRiesgo	= nivelRiesgo;	
	}
	
	public LesionesDermatologicas getProxNivel() {
		return this.proxNivel;
	}
	
	public void setProxNivel(LesionesDermatologicas nivel) {
		this.proxNivel = nivel;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Integer getNivelRiesgo() {
		return this.nivelRiesgo;
	}
	
}
