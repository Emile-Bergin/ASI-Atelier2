package com.sp.model;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class CardEntity {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id private long id;

	@Column(name="title")
	private String title;

	@Column(name="description")
	private String description;

	@Column(name="health_point")
	private int health_point;

	@Column(name="price")
    private int price;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_type", nullable = false)
	private CardTypeEntity type;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_family", nullable = false)
	private CardFamilyEntity family;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user", nullable = false)
	private UserEntity user;

	public CardEntity() {
	}

	/*@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}*/


}
