package com.sp.repository;

import com.sp.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByPasswordAndSurname(String password, String surname);

    @Modifying @Transactional
    @Query(value = "UPDATE customer SET wallet = ?2 WHERE id = ?1", 
    nativeQuery = true)
    void setWallet(Long id, int wallet);
}
