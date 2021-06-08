package fr.cpe.Lib.card.model;

import fr.cpe.Lib.user.model.UserDTO;

public class CardDTO {

    private Long id;
    private String title;
    private String description;
    private int health_point;
    private int price;
    private CardTypeDTO type;
    private CardFamilyDTO family;

    private UserDTO user;

    public CardDTO() {  }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealthPoint() {
        return this.health_point;
    }

    public void setHealthPoint(int health_point) {
        this.health_point = health_point;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CardFamilyDTO getFamily() {
        return this.family;
    }

    public void setFamily(CardFamilyDTO family) {
        this.family = family;
    }

    public CardTypeDTO getType() {
        return this.type;
    }

    public void setType(CardTypeDTO type) {
        this.type = type;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
