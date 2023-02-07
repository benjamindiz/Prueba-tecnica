package com.ibm.prueba.programa;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;

import com.ibm.prueba.programa.dao.ProveedorDao;
import com.ibm.prueba.programa.model.Proveedor;
import com.ibm.prueba.programa.util.JPAUtil;

public class Prueba {

	static String pattern = "dd/MM/yyyy";
	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	public static void main(String[] args) {
		if (args.length != 1)
			System.out.println("Es obligatorio informar el código del cliente");
		else {
			Long idCliente = Long.parseLong(args[0]);

			EntityManager em = JPAUtil.getEntityManager();
			ProveedorDao proveedorDao = new ProveedorDao(em);
			List<Proveedor> proveedores = proveedorDao.buscarPorCliente(idCliente);
			if (proveedores.isEmpty())
				System.out.println("El cliente no tiene proveedores asignados.");
			else {
				System.out.println("Proveedores:");
				System.out.println("id_proveedor, nombre, fecha de alta, id_cliente");
				proveedores.stream().forEach((p) -> {
					String fechaDeAlta = simpleDateFormat.format(p.getFechaDeAlta());
					System.out.println(
							p.getIdProveedor() + "," + p.getNombre() + "," + fechaDeAlta + "," + p.getIdCliente());
				});
			}
			em.close();
		}
	}
}
