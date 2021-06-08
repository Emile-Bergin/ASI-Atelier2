package fr.cpe.Lib.user.model;

import fr.cpe.Lib.card.model.CardDTO;

import java.util.List;

public class
UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String password;
    private String token;
    private int wallet;
    private List<CardDTO> card;

    public UserDTO() {

    }

    public UserDTO(long id, String name, String surname, String password, String token, int wallet) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.token = token;
        this.wallet = wallet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public List<CardDTO> getCard() {
        return card;
    }

    public void setCard(List<CardDTO> card) {
        this.card = card;
    }
}
