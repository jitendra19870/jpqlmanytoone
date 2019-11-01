package com.nit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nit.model.UserDetails;
import com.nit.model.Vehicle;

public class JpaSaveDataTest {
	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("pu");
		EntityManager entittyManager=emFactory.createEntityManager();
		entittyManager.getTransaction().begin();
		 UserDetails user1=new UserDetails();
		 user1.setUserName("Anil");
		 user1.setUserAddress("Hyd");
		 UserDetails user2=new UserDetails();
		 user2.setUserName("Abhi");
		 user2.setUserAddress("Pune");
		 
		 Vehicle v1=new Vehicle();
		 v1.setVehileName("AUDI");
		 v1.setUser(user1);
		 v1.setUser(user2);
		 Vehicle v2=new Vehicle();
		 v2.setVehileName("BMW");
		 v2.setUser(user1);
		 v2.setUser(user2);
		 Vehicle v3=new Vehicle();
		 v3.setVehileName("ALTO");
		 v3.setUser(user1);
		 entittyManager.persist(v1);
		 entittyManager.persist(v2);
		 entittyManager.persist(v3);
		 entittyManager.persist(user1);
		 entittyManager.persist(user2);
		 entittyManager.getTransaction().commit();
		 entittyManager.close();
		 
		
		
	}
	

}
