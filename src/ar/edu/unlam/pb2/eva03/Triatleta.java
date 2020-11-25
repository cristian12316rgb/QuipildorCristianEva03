package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements INadador{
	private String distaciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;

	Triatleta(Integer numeroDeSocio, String nombre,String distaciaPreferida,TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombre);
		this.distaciaPreferida=distaciaPreferida;
		this.tipoDeBicicleta=tipo;
	}

	public String getDistanciaPreferida() {
		return distaciaPreferida;
	}

	public void setDistaciaPreferida(String distaciaPreferida) {
		this.distaciaPreferida = distaciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	

}
