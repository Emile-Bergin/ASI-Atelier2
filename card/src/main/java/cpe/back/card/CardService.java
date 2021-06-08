package cpe.back.card;

import cpe.back.card.model.CardEntity;
import fr.cpe.Lib.card.model.CardDTO;
import fr.cpe.Lib.card.model.UserTransaction;
import fr.cpe.Lib.user.UserRest;
import fr.cpe.Lib.user.model.UserDTO;

import java.util.List;

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
        /*UserDTO user = userRepository.findById(transaction.getIdUser())
                .orElseThrow(() -> new RuntimeException("L'utilisateur recherchee n existe pas"));

        userRepository.setWallet(user.getId(), (user.getWallet()+card.getPrice()));*/
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
        /*UserDTO user = userRepository.findById(transaction.getIdUser())
                .orElseThrow(() -> new RuntimeException("L'utilisateur recherchee n existe pas"));

        if (user.getWallet() >= card.getPrice()) {
            userRepository.setWallet(user.getId(), (user.getWallet()-card.getPrice()));
            cardRepository.addUserIdToCard(card.getId(), user.getId());
            return true;
        }
        return false;*/
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
