package com.sp.model;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class UserEntity {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id private long id;

	@Column(name="name")
	private String name;

	@Column(name="surname")
	private String surname;

	@Column(name="password")
	private String password;

	@Column(name="token")
	private String token;

	@Column(name="wallet")
	private int wallet;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  	private List<CardEntity> card;

	public UserEntity() {

	}

	public UserEntity(long id,String name, String surname, String password, String token, int wallet) {
		super();
		this.id=id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.token = token;
		this.wallet = wallet;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}


}
