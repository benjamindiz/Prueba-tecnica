package com.ibm.prueba.programa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.ibm.prueba.programa.model.Proveedor;

public class ProveedorDao {

	private EntityManager em;

	public ProveedorDao(EntityManager em) {
		this.em = em;
	}

	public List<Proveedor> buscarPorCliente(Long idCliente) {
		String jpql = "SELECT p FROM Proveedor p WHERE p.idCliente = :idCliente";
		return em.createQuery(jpql, Proveedor.class).setParameter("idCliente", idCliente).getResultList();
	}
}
