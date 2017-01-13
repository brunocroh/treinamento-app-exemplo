package org.app.negocio.entidade;

public class Carro {
	
	String modelo;
	Integer ano;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, Integer ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", ano=" + ano + "]";
	}
	
}
