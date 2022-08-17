package com.ty.oneToMany.crontroller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Mobile;
import com.ty.oneToMany.dto.Sim;

public class TestSave {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Mobile mobile = new Mobile();
		mobile.setName("Nokia");
		mobile.setCost(250000);
	
		
		List<Sim> list = new ArrayList<Sim>();
		Sim s1 = new Sim();
		s1.setImrc(12343489);
		s1.setProvider("BSNL");
		list.add(s1);
		
		Sim s2 = new Sim();
		s2.setImrc(233345667);
		s2.setProvider("DOCOMO");
		list.add(s2);
		mobile.setSim(list);
		
		
		transaction.begin();
		manager.persist(mobile);
		manager.persist(s1);
		manager.persist(s2);
		transaction.commit();
		System.out.println("------------------data stored--------------");
	}

}
