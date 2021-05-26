package com.sp.model;

public class UserTransaction {
    private Long idUser;
    private Integer idCard;

    public UserTransaction(Long idUser, Integer idCard) {
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

    public Long getIdUser() {
        return idUser;
    }

    public Integer getIdCard() {
        return idCard;
    }
}
