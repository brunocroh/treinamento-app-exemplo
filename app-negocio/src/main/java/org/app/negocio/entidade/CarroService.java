package org.app.negocio.entidade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CarroService {
	
	public List<Carro> getCarros() {
		ArrayList<Carro> lista = new ArrayList<Carro>();
		lista.add(new Carro("Ford Ka", 2012));
		lista.add(new Carro("Mercedes", 2016));
		lista.add(new Carro("Pampa", 2002));
		return lista;
	}
	

}
