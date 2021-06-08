package fr.cpe.card.model;

import fr.cpe.user.model.UserDTO;

public class CardDTO {

    private Long id;
    private String title;
    private String description;
    private int health_point;
    private int price;
    private long id_type;
    private long id_family;
    private long id_user;

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

    public long getIdFamily() {
        return this.id_family;
    }

    public void setIdFamily(long id_family) {
        this.id_family = id_family;
    }

    public long getIdType() {
        return this.id_type;
    }

    public void setIdType(long id_type) {
        this.id_type = id_type;
    }

    public long getIdUser() {
        return id_user;
    }

    public void setIdUser(long id_user) {
        this.id_user = id_user;
    }
}
