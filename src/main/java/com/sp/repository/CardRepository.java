package com.sp.repository;

public class CardRepository {
    public boolean deleteUserIdFromCard(Integer idCard){
        return true;
    }

    public boolean addUserIdToCard(Integer idCard) {
        return true;
    }

    public boolean removeCash(Integer IdUser, Integer cash){
        return true;
    }

    public boolean addCash(Integer idUser, Integer price) {
        return true;
    }

    public Integer getPrice(Integer idCard) {
        return 1;
    }

    
}
