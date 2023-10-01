package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso{
	
	private Integer cantHorasExtras;
	
	
	public IngresoPorHorasExtras(String mes, String concepto, Double monto, Integer hsExtras) {
		super(mes, concepto, monto);
		this.cantHorasExtras = hsExtras;
	}

	@Override
	public Double montoImponible() {
		return 0d;
	}
	
	
	public Integer getCantHorasExtras() {
		return this.cantHorasExtras;
	}

}
