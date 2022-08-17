package com.ty.oneToMany.crontroller;

import java.util.ArrayList;
import java.util.List;

import com.ty.oneToMany.dao.BusDao;
import com.ty.oneToMany.dto.Bus;
import com.ty.oneToMany.dto.Organization;

public class SaveBus {
	public static void main(String[] args) {
		
		BusDao bdao = new BusDao();
		Organization organization = new Organization();
		organization.setName("KSRTC");
		organization.setAddress("Mysore");
		
		Bus bus = new Bus();
		bus.setCapacity(65);
		bus.setType("Semi Sleeper");
		
		
		Bus bus1 = new Bus();
		bus1.setCapacity(115);
		bus1.setType("Sleeper");
		
		
		List<Bus> list = new ArrayList<Bus>();
		list.add(bus1);
		list.add(bus);
		organization.setBus(list);
		bdao.saveOrganization(organization, list);
		System.out.println("--------------data saved-----------------");
		
	}

}
