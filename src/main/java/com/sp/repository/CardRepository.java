package com.sp.repository;

import com.sp.model.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Integer> {
    /*public boolean deleteUserIdFromCard(Integer idCard);

    public boolean addUserIdToCard(Integer idCard);

    public Integer getPrice(Integer idCard);

    public List<CardEntity> getCards();*/

}
