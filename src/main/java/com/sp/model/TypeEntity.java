package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypeEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String code;

	public TypeEntity() {
		super();
	}

	/*@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}*/


}
