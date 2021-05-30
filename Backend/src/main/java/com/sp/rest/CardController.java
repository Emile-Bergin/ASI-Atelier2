package com.sp.rest;

import com.sp.model.CardEntity;
import com.sp.model.UserTransaction;
import com.sp.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/card")
public class CardController {

    private CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/list")
    List<CardEntity> getCards() {
        return cardService.getCards();
    }

    @GetMapping("/list/sell") 
    List<CardEntity> getSellCards() {
        return cardService.getSellCards();
    }

    @GetMapping("/list/user")
    List<CardEntity> getUserCards(@CookieValue("session") long cookie) {
        return cardService.getUserCards(cookie);
    }

    @PostMapping("/sell")
    Boolean sellCard(@RequestBody UserTransaction transaction) {
        return cardService.sellCard(transaction);
    }

    @PostMapping("/buy")
    Boolean buyCard(@RequestBody UserTransaction transaction) {
        return cardService.buyCard(transaction);
    }
}
