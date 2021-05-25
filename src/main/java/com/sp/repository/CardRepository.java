package com.sp.repository;

import com.sp.model.CardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {
    /*public boolean deleteUserIdFromCard(Integer idCard);

    public boolean addUserIdToCard(Integer idCard);

    public Integer getPrice(Integer idCard);

    public List<CardEntity> getCards();*/
}
