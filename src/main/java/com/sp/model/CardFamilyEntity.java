package com.sp.model;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "card_family")
public class CardFamilyEntity {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id private long id;

	@Column(name="name")
	private String name;

	@Column(name="code")
	private String code;

	@OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
  	private List<CardEntity> card;

	public CardFamilyEntity() {
	}

	/*@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}*/


}
