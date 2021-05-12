package com.sp.repository;

import com.sp.model.CardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<CardEntity, Integer> {
    /*public boolean deleteUserIdFromCard(Integer idCard);

    public boolean addUserIdToCard(Integer idCard);

    public Integer getPrice(Integer idCard);

    public List<CardEntity> getCards();*/
}
