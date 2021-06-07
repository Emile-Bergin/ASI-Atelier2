package fr.cpe.Lib.card.model;

public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private int health_point;
    private int price;
    private CardTypeEntity type;
    private CardFamilyEntity family;

    private UserEntity user;

    public CardEntity() {  }

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

    public CardFamilyEntity getFamily() {
        return this.family;
    }

    public void setFamily(CardFamilyEntity family) {
        this.family = family;
    }

    public CardTypeEntity getType() {
        return this.type;
    }

    public void setType(CardTypeEntity type) {
        this.type = type;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
