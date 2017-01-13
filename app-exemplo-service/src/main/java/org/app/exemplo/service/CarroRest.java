package org.app.exemplo.service;

import java.util.List;

import org.app.negocio.entidade.Carro;
import org.app.negocio.entidade.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@Controller("/carro")
public class CarroRest {
	
	/**  Inversion of control */
	@Autowired CarroService carroService;
	
	/**
	 * RequestMethod tem opcoes para GET, POST, PUT e DELETE
	 */
	@RequestMapping(name = "/listar", method = RequestMethod.GET ) 
	public @ResponseBody List<Carro> getCarros() {
		return carroService.getCarros();
	}

	@RequestMapping(name = "/adicionar", method = RequestMethod.PUT ) 
	public @ResponseBody boolean addCarro(@RequestBody Carro novoCarro) {
		System.out.println(novoCarro);
		return true;
	}

}
