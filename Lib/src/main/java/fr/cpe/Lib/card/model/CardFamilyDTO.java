package fr.cpe.Lib.card.model;

import java.util.List;

public class CardFamilyDTO {
    private long id;
    private String name;
    private String code;
    private String color;
    private List<CardDTO> card;

    public CardFamilyDTO() {
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
