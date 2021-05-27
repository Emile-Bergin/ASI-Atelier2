package com.sp.repository;

import java.util.List;
import java.util.Optional;

import com.sp.model.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {

    @Query(
        value = "SELECT * FROM card c WHERE c.id_user = ?1", 
        nativeQuery = true)
    List<CardEntity> findAllByUser(int idUser);

    @Query(value = "SELECT * FROM card c WHERE c.id_user is null", 
    nativeQuery = true)
    List<CardEntity> findAllByUserNull();


    @Query(value = "UPDATE card c SET c.id_user = ?2 WHERE c.id = ?1", 
    nativeQuery = true)
    void addUserIdToCard(Long idCard, Long idUser);

}
