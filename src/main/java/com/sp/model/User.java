package com.sp.model;

public class User {
	
	private int id;
	private String name;
	private String surname;
	private String password;
	
	public User() {
	}

	public User(int id,String name, String surname, String password) {
		super();
		this.id=id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsurname() {
		return surname;
	}

	public void setsurname(String surname) {
		this.surname = surname;
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}


}
