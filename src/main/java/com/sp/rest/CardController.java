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
    public CardController(){
        cardService = new CardService();
    }

    @PostMapping("/sell")
    Boolean sellCard(@RequestBody UserTransaction transaction) {
        System.out.println(transaction.toString());
        return cardService.sellCard(transaction);
    }

    @PostMapping("/buy")
    Boolean buyCard(@RequestBody UserTransaction transaction) {
        System.out.println(transaction.toString());
        return cardService.buyCard(transaction);
    }

    @GetMapping("/cards")
    List<CardEntity> getCards(){
        return cardService.getCards();
    }
}