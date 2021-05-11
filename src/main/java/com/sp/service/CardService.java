package com.sp.service;

import com.sp.model.CardEntity;
import com.sp.model.UserTransaction;
import com.sp.repository.CardRepository;
import com.sp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;
    private UserRepository userRepository;
    public CardService(){
        cardRepository = new CardRepository();
    }

    public boolean sellCard(UserTransaction transaction) {
        if (cardRepository.deleteUserIdFromCard(transaction.getIdCard())){
            Integer price = cardRepository.getPrice(transaction.getIdCard());
            Integer wallet = userRepository.getWallet(transaction.getIdUser());
            return userRepository.setWallet(transaction.getIdUser(), wallet+price);
        }
        return false;
    }

    public boolean buyCard(UserTransaction transaction) {
        Integer price = cardRepository.getPrice(transaction.getIdCard());
        Integer wallet = userRepository.getWallet(transaction.getIdUser());
        if(userRepository.setWallet(transaction.getIdUser(), wallet-price)){
            return cardRepository.addUserIdToCard(transaction.getIdUser());
        }
        return false;
    }

    public List<CardEntity> getCards() {
        return cardRepository.getCards();
    }
}
