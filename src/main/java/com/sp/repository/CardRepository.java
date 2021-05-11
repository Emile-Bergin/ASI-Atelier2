package com.sp.repository;

import com.sp.model.CardEntity;

import java.util.List;

public class CardRepository {
    public boolean deleteUserIdFromCard(Integer idCard){
        return true;
    }

    public boolean addUserIdToCard(Integer idCard) {
        return true;
    }

    public Integer getPrice(Integer idCard) {
        return 1;
    }

    public List<CardEntity> getCards() {
        return null;
    }
}
