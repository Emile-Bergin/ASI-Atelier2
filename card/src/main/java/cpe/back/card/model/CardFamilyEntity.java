package cpe.back.card.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "card_family")
public class CardFamilyEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "color")
    private String color;

    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
    private List<CardEntity> card;

    public CardFamilyEntity() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	/*@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}*/


}
