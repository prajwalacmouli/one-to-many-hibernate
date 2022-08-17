package com.ty.oneToMany.crontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Mobile;

public class GetMobileById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Mobile mobile = manager.find(Mobile.class, 2);
		System.out.println(mobile);
		System.out.println("-----------------Data Saved-----------------------");



	}

}
