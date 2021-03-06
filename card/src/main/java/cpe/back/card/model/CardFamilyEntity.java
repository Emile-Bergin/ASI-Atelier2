package cpe.back.card.model;

import fr.cpe.card.model.CardFamilyDTO;

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

    public CardFamilyDTO toDTO() {
        CardFamilyDTO cardFamilyDTO = new CardFamilyDTO();
        cardFamilyDTO.setCode(this.code);
        cardFamilyDTO.setName(this.name);
        cardFamilyDTO.setColor(this.color);
        return cardFamilyDTO;
    }

	/*@Override
	public String toString() {
		return "User ["+this.id+"]: name:"+this.name+", surname:"+this.surname;
	}*/


}
