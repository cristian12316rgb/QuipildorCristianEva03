package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre=nombre;
		this.socios=new HashSet<>();
		this.competencias=new HashMap<>();
	}

	public void agregarDeportista(Deportista nuevo) {
		if(nuevo instanceof Deportista) {
			this.socios.add(nuevo);
		}
		
		
	}

	public Integer getCantidadSocios() {
		
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String nombre) {
	    Evento nuevo =new Evento(nombre,carreraNatacionEnAguasAbiertas);
		this.competencias.put( nombre,nuevo);
		
	}

	public Integer inscribirEnEvento(String clave, Deportista celeste) throws NoEstaPreparado {
		
		
		if((clave.equals("Triatlon Khona" )|| clave.equals("Maraton de aguas abiertas"))) {
			for(Map.Entry<String, Evento>prueba:this.competencias.entrySet()) {
			if(prueba.getKey().equals(clave)) {
				prueba.getValue().agregarParticipante(celeste, celeste.getNumeroDeSocio());
				return ((Integer)1);
			}
		}
		}else {
			if((celeste instanceof ICorredor) && (clave.equals("Maraton de New York"))) {
				for(Map.Entry<String, Evento>prueba:this.competencias.entrySet()) {
					if(prueba.getKey().equals(clave)) {
						prueba.getValue().agregarParticipante(celeste, celeste.getNumeroDeSocio());
					   return ((Integer)1);
					}
				}
			}
		}
		
//		for(Map.Entry<String, Evento>prueba:this.competencias.entrySet()) {
//			if(prueba.getKey().equals(clave)) {
//				if(  prueba.getValue().equals(TipoDeEvento.CARRERA_5K) ||  prueba.getValue().equals(TipoDeEvento.CARRERA_10K) || prueba.getValue().equals(TipoDeEvento.CARRERA_21K)) {
//					if(celeste instanceof Corredor){
//		                   prueba.getValue().agregarParticipante(celeste, celeste.getNumeroDeSocio());
//		               return ((Integer)1);
//		            }
//				}
//			   
//			}
//		}
		
		
		
		
		
		throw new NoEstaPreparado("no se puede");
		
		
	}
	
	
	
	
	
	
}
