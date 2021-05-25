package com.sp.service;

import com.sp.model.CardEntity;
import com.sp.model.UserEntity;
import com.sp.model.UserTransaction;
import com.sp.repository.CardRepository;
import com.sp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;
    private UserRepository userRepository;

    public CardService(CardRepository cardRepository, UserRepository userRepository) {
        this.cardRepository = cardRepository;
        this.userRepository = userRepository;
    }

    public boolean sellCard(UserTransaction transaction) {
        CardEntity card = cardRepository.findById(transaction.getIdCard())
                .orElseThrow(() -> new RuntimeException("La carte recherchee n existe pas"));
        card.setUser(null);
        cardRepository.save(card);
        Integer price = card.getPrice();
        UserEntity user = userRepository.findById(transaction.getIdUser())
                .orElseThrow(() -> new RuntimeException("L'user recherche n existe pas"));
        user.setWallet(user.getWallet() + price);
        userRepository.save(user);
        return true;
    }

    public boolean buyCard(UserTransaction transaction) {/*
        Integer price = cardRepository.getPrice(transaction.getIdCard());
        Integer wallet = userRepository.getWallet(transaction.getIdUser());
        if(userRepository.setWallet(transaction.getIdUser(), wallet-price)){
            return cardRepository.addUserIdToCard(transaction.getIdUser());
        }*/
        return false;
    }

    public List<CardEntity> getCards() {
        return cardRepository.findAll();
    }

    public List<CardEntity> getSellCards() {
        return cardRepository.findAllByUserNull();
    }

    public List<CardEntity> getUserCards(Integer idUser) {
        return cardRepository.findAllByUser(idUser);
    }
}
