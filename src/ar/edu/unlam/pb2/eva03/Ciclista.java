package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista{
	private String tipoDeBicicleta;

	Ciclista(Integer numeroDeSocio, String nombre,String tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta=tipoDeBicicleta;
	}

	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	

	

}
