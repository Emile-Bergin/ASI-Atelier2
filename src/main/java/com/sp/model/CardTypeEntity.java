package com.sp.model;

import javax.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "card_type")
public class CardTypeEntity {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id private long id;


	@Column(name="name")
	private String name;

	@Column(name="code")
	private String code;

	@OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
  	private List<CardEntity> card;

	public CardTypeEntity() {
	}

	/*@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}*/


}
