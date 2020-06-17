package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String country;


	public Employee() {
		super();
	}

	public Employee(Long id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	





}
