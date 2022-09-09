package com.uce.edu.ec.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.demo.modelo.Vuelo;
import com.uce.edu.ec.demo.repository.IVueloRepository;

@Transactional
@Service
public class VueloServiceImpl implements IVueloService {

	@Autowired
	private IVueloRepository iVueloRepository;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Vuelo> buscarVuelos(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		
		List<Vuelo> v = this.iVueloRepository.buscarVuelosDisponibles(origen, destino, fechaVuelo);
		  
		
		List<Vuelo> vuelosDisponible= v.stream().filter(x->x.getEstado().equalsIgnoreCase("DIS")).collect(Collectors.toList());
		return vuelosDisponible;
	}

	@Override
	public Vuelo buscarNumero(String numeroVuelo) {
		// TODO Auto-generated method stub
		
		return this.iVueloRepository.buscarNumero(numeroVuelo);
	}

}
