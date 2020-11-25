package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{
	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados=0;

	Corredor(Integer numeroDeSocio, String nombre,Integer distaciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distaciaPreferida;
	}
	
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados=km;
	}
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	
	

}
