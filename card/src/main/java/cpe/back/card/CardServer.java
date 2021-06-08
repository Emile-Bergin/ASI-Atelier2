package cpe.back.card;

import cpe.back.card.model.CardEntity;
import fr.cpe.Lib.card.CardRest;
import fr.cpe.Lib.card.model.CardDTO;
import fr.cpe.Lib.card.model.UserTransaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CardServer implements CardRest {
    private CardService cardService;

    public CardServer(CardService cardService) {
        this.cardService = cardService;
    }

    @Override
    public List<CardDTO> getCards() {
        return convertListCardToDTO(cardService.getCards());
    }

    @Override
    public List<CardDTO> getSellCards() {
        return convertListCardToDTO(cardService.getSellCards());
    }

    @Override
    public List<CardDTO> getUserCards(long cookie) {
        return convertListCardToDTO(cardService.getUserCards(cookie));
    }

    @Override
    public Boolean sellCard(UserTransaction transaction) {
        return cardService.sellCard(transaction);
    }

    @Override
    public Boolean buyCard(UserTransaction transaction) {
        return cardService.buyCard(transaction);
    }

    private List<CardDTO> convertListCardToDTO(List<CardEntity> list) {
        List<CardDTO> listDTO = new ArrayList<>();
        for(CardEntity card : list){
            listDTO.add(card.toDTO());
        }
        return listDTO;
    }
}
