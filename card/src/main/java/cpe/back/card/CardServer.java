package cpe.back.card;

import cpe.back.card.model.CardEntity;
import fr.cpe.Lib.card.CardRest;
import fr.cpe.Lib.card.model.CardDTO;
import fr.cpe.Lib.card.model.UserTransaction;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CardServer implements CardRest {
    private CardService cardService;

    public CardServer(CardService cardService) {
        this.cardService = cardService;
    }

    @Override
    public List<CardDTO> getCards() {
        List<CardEntity> list = cardService.getCards();
    }

    @Override
    public List<CardDTO> getSellCards() {
        return cardService.getSellCards();
    }

    @Override
    public List<CardDTO> getUserCards(long cookie) {
        return cardService.getUserCards(cookie);
    }

    @Override
    public Boolean sellCard(UserTransaction transaction) {
        return cardService.sellCard(transaction);
    }

    @Override
    public Boolean buyCard(UserTransaction transaction) {
        return cardService.buyCard(transaction);
    }
}
