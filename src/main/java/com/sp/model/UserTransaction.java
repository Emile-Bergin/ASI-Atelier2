package com.sp.model;

public class UserTransaction {
    private Integer idUser;
    private Integer idCard;

    public UserTransaction(Integer idUser, Integer idCard) {
        this.idUser = idUser;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "UserTransaction{" +
                "idUser=" + idUser +
                ", idCard=" + idCard +
                '}';
    }

    public Integer getIdUser() {
        return idUser;
    }

    public Integer getIdCard() {
        return idCard;
    }
}
