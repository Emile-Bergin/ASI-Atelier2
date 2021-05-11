package com.sp.rest;

import com.sp.service.CardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/card")
public class CardController {

    private CardService cardService;
    public CardController(){
        cardService = new CardService();
    }

    @PostMapping("/sell")
    Boolean sellCard(@RequestBody Integer idCard, Integer idUser) {
        return cardService.sellCard(idCard, idUser);
    }

    @PostMapping("/buy")
    Boolean buyCard(@RequestBody Integer idCard, Integer idUser) {
        return cardService.buyCard(idCard, idUser);
    }
}
