package com.uce.edu.ec.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.demo.modelo.Vuelo;

@Transactional
@Repository
public class VueloRepositoryImpl implements IVueloRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, String fechaVuelo) {
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery(
				"SELECT v FROM Vuelo v WHERE v.origen=:datoOrigen and v.destino=:datoDestino and v.fechaVuelo=:datoFecha",
				Vuelo.class);
		myQuery.setParameter("datoOrigen", origen);
		myQuery.setParameter("datoDestino", destino);
		myQuery.setParameter("datoFecha", fechaVuelo);
		return myQuery.getResultList();
	}

	@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Vuelo buscarNumero(String numeroVuelo) {
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery("SELECT v FROM Vuelo v WHERE v.numero=:valor",
				Vuelo.class);
		myQuery.setParameter("valor", numeroVuelo);

//		Vuelo vuelo = myQuery.getSingleResult();

		return myQuery.getSingleResult();
	}

}
