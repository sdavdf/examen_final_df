package com.uce.edu.ec.demo.repository;

import java.util.List;

import com.uce.edu.ec.demo.modelo.Vuelo;

public interface IVueloRepository {

	public void insertar(Vuelo vuelo);

	public void actualizar(Vuelo vuelo);

	public Vuelo buscar(Integer id);

	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, String fechaVuelo);

	public Vuelo buscarNumero(String numeroVuelo);

}
