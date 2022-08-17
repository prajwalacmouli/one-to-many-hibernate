package com.ty.oneToMany.crontroller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.FoodOrder;
import com.ty.oneToMany.dto.Item;

public class TestSaveFoodOrder {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Item i1 = new Item();
		i1.setName("Paneer");
		i1.setQty(2);
		i1.setCost(250);

		Item i2 = new Item();
		i2.setName("Mushrooms");
		i2.setQty(3);
		i2.setCost(500);
		
		Item i3 = new Item();
		i3.setName("BabyCorn");
		i3.setQty(4);
		i3.setCost(350);
		
		List<Item> list = new ArrayList<Item>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		
		FoodOrder fod = new FoodOrder();
		fod.setCustomerName("Priya");
		fod.setAddress("Bangalore");
		fod.setPhone(987654432);
		fod.setItem(list);
		
		transaction.begin();
		manager.persist(fod);
		manager.persist(i1);
		manager.persist(i2);
		manager.persist(i3);
		transaction.commit();
		System.out.println("Done!!!");
		
		

		

		
	}

}
