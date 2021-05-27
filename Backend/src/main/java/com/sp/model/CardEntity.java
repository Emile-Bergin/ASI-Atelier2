package com.sp.model;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class CardEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "health_point")
    private int health_point;

    @Column(name = "price")
    private int price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type", nullable = false)
    private CardTypeEntity type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_family", nullable = false)
    private CardFamilyEntity family;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private UserEntity user;

    public CardEntity() {

    }

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
