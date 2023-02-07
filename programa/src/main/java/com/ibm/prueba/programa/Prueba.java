package com.ibm.prueba.programa;

import java.util.List;

import javax.persistence.EntityManager;

import com.ibm.prueba.programa.dao.ProveedorDao;
import com.ibm.prueba.programa.model.Proveedor;
import com.ibm.prueba.programa.util.JPAUtil;

public class Prueba {

	public static void main(String[] args) {

		Long idCliente = Long.parseLong(args[0]);

		EntityManager em = JPAUtil.getEntityManager();
		ProveedorDao proveedorDao = new ProveedorDao(em);
		List<Proveedor> proveedores = proveedorDao.buscarPorCliente(idCliente);
		
		proveedores.stream().forEach((p) -> {
			System.out.println(p.getIdCliente() + "," + p.getNombre() + ","  + p.getFechaDeAlta() + "," + p.getIdCliente());
	});

	}

}
