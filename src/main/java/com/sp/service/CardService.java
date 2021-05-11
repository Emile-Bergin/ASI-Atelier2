package com.sp.service;

import com.sp.repository.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    private CardRepository cardRepository;
    public CardService(){
        cardRepository = new CardRepository();
    }

    public boolean sellCard(Integer idCard, Integer idUser) {
        if (cardRepository.deleteUserIdFromCard(idCard)){
            Integer price = cardRepository.getPrice(idCard);
            return cardRepository.addCash(idUser, price);
        }
        return false;
    }

    public boolean buyCard(Integer idCard, Integer idUser) {
        Integer price = cardRepository.getPrice(idCard);
        if(cardRepository.removeCash(idUser, price)){
            return cardRepository.addUserIdFromCard(idCard);
        }
        return false;
    }
}
