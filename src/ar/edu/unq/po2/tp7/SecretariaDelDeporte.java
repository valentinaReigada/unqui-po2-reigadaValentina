package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;


public class SecretariaDelDeporte {
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public SecretariaDelDeporte(List<ActividadSemanal> actividades) {
		this.actividades = actividades;
	}
	
	public void agregarActividad(ActividadSemanal actividad) {
		this.getActividades().add(actividad);
	}
	
	public void eliminarActividad(ActividadSemanal actividad) {
		if(this.actividades.contains(actividad)) {
			this.actividades.remove(this.actividades.indexOf(actividad));
		}
	}
	
	public List<ActividadSemanal> getActividades(){
		return this.actividades;
	}
	
	public List<ActividadSemanal> todasLasActividadesDeFutbol(){
		//en la version de Java que tengo no acepta poner .ToList() de una, hay que hacer este paso para -
		//convertir en List.
		return this.getActividades().stream()
									.filter(act -> act.getDeporte() == Deporte.FUTBOL)
									.collect(Collectors.toList());
	}
	
	public List<ActividadSemanal> todasLasActividadesDeComplejidad(Integer complejidad){
			return this.getActividades().stream()
				.filter(act -> act.getDeporte().getComplejidad() == complejidad)
				.collect(Collectors.toList());
	}
	
	public Integer cantHorasDeActividades() {
		return this.getActividades().stream().mapToInt(act -> act.getDuracion()).sum();
	}
	
	 
	public ActividadSemanal actividadDeMenorCostoDe(Deporte deporte) {
		this.getActividades().sort(Comparator.comparing(ActividadSemanal :: costoActividad));
		return this.getActividades().stream().findFirst().get();
	}
	
	public Map<Deporte, List<ActividadSemanal>> actividadesMasEconomicas(){
		Map<Deporte, List<ActividadSemanal>> actividadesPorDeporte =
				this.getActividades().stream()
				.collect(Collectors.groupingBy(ActividadSemanal :: getDeporte));
		
		for(List<ActividadSemanal> lista : actividadesPorDeporte.values()) {
			lista.sort(Comparator.comparing(ActividadSemanal :: costoActividad));
			lista.stream().findFirst().get();
		}
		
		return actividadesPorDeporte;

	}
	
	
}
