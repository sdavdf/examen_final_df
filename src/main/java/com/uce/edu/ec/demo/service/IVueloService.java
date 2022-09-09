package com.uce.edu.ec.demo.service;

import java.util.List;

import com.uce.edu.ec.demo.modelo.Vuelo;

public interface IVueloService {

	public List<Vuelo> buscarVuelos(String origen, String destino, String fechaVuelo);

	public Vuelo buscarNumero(String numeroVuelo);
	
	

}
