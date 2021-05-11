package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String surname;
	private String password;
<<<<<<< HEAD:src/main/java/com/sp/model/User.java
	
	public User() {
	}
=======
	private Integer wallet;
>>>>>>> 8b41227c468582e69fd5b987bb1585fe14e3899b:src/main/java/com/sp/model/UserEntity.java

	public UserEntity(int id,String name, String surname, String password) {
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
