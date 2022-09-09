package com.uce.edu.ec.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.ec.demo.modelo.Vuelo;
import com.uce.edu.ec.demo.service.IVueloService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IVueloService vueloService;

	
	@GetMapping("/buscarVuelos")
	public String obtenerPaginaIngresoDatos(Vuelo vuelo) {
		return "buscarVuelos";

	}

	
	@GetMapping("/mostrar/vuelosDisponibles")
	public String mostrarVuelos(Vuelo vuelo, Model modelo) {
		List<Vuelo> vuelos = this.vueloService.buscarVuelos(vuelo.getOrigen(), vuelo.getDestino(),
				vuelo.getFechaVuelo());

		modelo.addAttribute("vuelos", vuelos);
		return "mostrarVuelos";

	}

}
