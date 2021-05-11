package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CardEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String description;
	private Integer health_point;
    private Integer price;
    private Integer id_type;
    private Integer id_family;
    private Integer id_user;

	public CardEntity() {
		super();
	}

	/*@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}*/


}
