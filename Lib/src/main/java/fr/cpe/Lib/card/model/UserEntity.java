package fr.cpe.Lib.card.model;

import java.util.List;

public class UserEntity {

    private Long id;
    private String name;
    private String surname;
    private String password;
    private String token;
    private int wallet;
    private List<CardEntity> card;

    public UserEntity() {

    }

    public UserEntity(long id, String name, String surname, String password, String token, int wallet) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.token = token;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "User [" + this.id + "]: name:" + this.name + ", surname:" + this.surname;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
