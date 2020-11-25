package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private String nombre;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	Evento(String nombre,TipoDeEvento carreraNatacionEnAguasAbiertas){
		this.tipo=carreraNatacionEnAguasAbiertas;
		this.participantes=new HashMap<>();
		this.nombre=nombre;
	}
	public Boolean agregarParticipante(Deportista nueva,Integer numeroDeInscripcion) {
		Boolean resultado=false;
		if(nueva instanceof Deportista) {
			this.participantes.put( numeroDeInscripcion,nueva);
			resultado=true;
		}
		return resultado;
		
	}
	
}
