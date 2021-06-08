package fr.cpe.card.model;

import java.util.List;

public class CardTypeDTO {
    private long id;
    private String name;
    private String code;
    private String color;

    public CardTypeDTO() {
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

}
