package cpe.back.card;

import com.sp.model.CardEntity;
import cpe.back.card.model.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {

    // Find all card with specific user id
    @Query(
        value = "SELECT * FROM card c WHERE c.id_user = ?1", 
        nativeQuery = true)
    List<CardEntity> findAllByUser(long idUser);

    // Find all card without user
    @Query(value = "SELECT * FROM card c WHERE c.id_user is null", 
    nativeQuery = true)
    List<CardEntity> findAllByUserNull();

    // Save a card for a user
    @Modifying @Transactional
    @Query(value = "UPDATE card SET id_user = ?2 WHERE id = ?1", 
    nativeQuery = true)
    void addUserIdToCard(Long idCard, Long idUser);

    // Save a card without user
    @Modifying @Transactional
    @Query(value = "UPDATE card SET id_user = NULL WHERE id = ?1", 
    nativeQuery = true)
    void userSetNull(Long idCard);

}
