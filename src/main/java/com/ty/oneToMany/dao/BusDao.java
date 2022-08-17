package com.ty.oneToMany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Bus;
import com.ty.oneToMany.dto.Organization;

public class BusDao {

	public void saveOrganization(Organization organization, List<Bus> bus) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(organization);
		for (int i = 0; i <bus.size(); i++) {
			manager.persist(bus.get(i));
		}
		transaction.commit();

	}

}
