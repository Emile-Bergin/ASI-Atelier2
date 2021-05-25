package com.sp.repository;

import com.sp.model.CardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Integer> {
    /*public boolean deleteUserIdFromCard(Integer idCard);

    public boolean addUserIdToCard(Integer idCard);

    public Integer getPrice(Integer idCard);

    public List<CardEntity> getCards();*/
}
