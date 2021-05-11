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
    Integer sellCard(@RequestBody Integer idCard) {
        return cardService.sellCard(idCard);
    }

    @PostMapping("/buy")
    Integer buyCard(@RequestBody Integer idCard) {
        return cardService.buyCard(idCard);
    }
}
