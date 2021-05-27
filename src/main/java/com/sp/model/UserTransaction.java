package com.sp.model;

public class UserTransaction {
    private Long idUser;
    private Long idCard;

    public UserTransaction(Long idUser, Long idCard) {
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

    public Long getIdCard() {
        return idCard;
    }
}
