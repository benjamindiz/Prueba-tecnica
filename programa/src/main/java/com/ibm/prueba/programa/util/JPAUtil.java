package com.ibm.prueba.programa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("bd_ibm");

	public static EntityManager getEntityManager() { 
		return FACTORY.createEntityManager();
	}
}
