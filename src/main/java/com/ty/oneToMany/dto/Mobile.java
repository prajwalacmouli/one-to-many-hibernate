package com.ty.oneToMany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int cost;
	@OneToMany
	List<Sim> sim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile \nid=" + id + ", \nname=" + name + ", \ncost=" + cost + ", \nsim=" + sim +"";
	}
	

}
