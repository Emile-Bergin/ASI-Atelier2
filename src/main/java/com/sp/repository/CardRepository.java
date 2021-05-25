package com.sp.repository;

import java.util.List;
import java.util.Optional;

import com.sp.model.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Integer> {

    @Query(
        value = "SELECT * FROM card c WHERE c.id_user = ?1", 
        nativeQuery = true)
    List<CardEntity> findAllByUser(int idUser);

    @Query(value = "SELECT * FROM card c WHERE c.id_user is null", 
    nativeQuery = true)
    List<CardEntity> findAllByUserNull();

}
