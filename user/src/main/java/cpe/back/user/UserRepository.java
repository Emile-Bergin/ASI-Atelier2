package cpe.back.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Find use by surname and password
    Optional<UserEntity> findByPasswordAndSurname(String password, String surname);

    // Save user wallet
    @Modifying @Transactional
    @Query(value = "UPDATE customer SET wallet = ?2 WHERE id = ?1", 
    nativeQuery = true)
    void setWallet(Long id, int wallet);

    UserEntity getById(Long userId);
}
