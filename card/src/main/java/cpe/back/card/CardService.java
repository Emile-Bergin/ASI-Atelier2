package cpe.back.card;

import cpe.back.card.model.CardEntity;
import fr.cpe.card.model.CardDTO;
import fr.cpe.card.model.UserTransaction;
import fr.cpe.user.UserRest;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;
    private UserRest userRest;

    public CardService(CardRepository cardRepository, UserRest userRest) {
        this.cardRepository = cardRepository;
        this.userRest = userRest;
    }

    public boolean sellCard(UserTransaction transaction) {
        CardEntity card = cardRepository.findById(transaction.getIdCard())
                .orElseThrow(() -> new RuntimeException("La carte recherchee n existe pas"));
        if(userRest.setWallet(transaction.getIdUser(),card.getPrice())){
            cardRepository.userSetNull(card.getId());
            return true;
        }else {
            return false;
        }
    }

    public boolean buyCard(UserTransaction transaction) {
        CardEntity card = cardRepository.findById(transaction.getIdCard())
                .orElseThrow(() -> new RuntimeException("La carte recherchee n existe pas"));
        if(userRest.setWallet(transaction.getIdUser(),-card.getPrice())){
            cardRepository.addUserIdToCard(card.getId(), transaction.getIdUser());
            return true;
        }else {
            return false;
        }
    }

    public List<CardEntity> getCards() {
        return cardRepository.findAll();
    }

    public List<CardEntity> getSellCards() {
        return cardRepository.findAllByUserNull();
    }

    public List<CardEntity> getUserCards(Long idUser) {
        return cardRepository.findAllByUser(idUser);
    }
}
