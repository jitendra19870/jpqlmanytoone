package com.nit.test;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ExpMain2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		try {
			nativeQueries(emf);
		} finally {
			emf.close();
		}
	}

	private static void nativeQueries(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNativeQuery("Select * from VEHICLE1");
		List list = query.getResultList();
		for (Object o : list) {
			System.out.println(Arrays.toString((Object[]) o));
		}
	}

}
