package fr.cpe.card;

import fr.cpe.card.model.CardDTO;
import fr.cpe.card.model.UserTransaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "microservice-user", url = "http://card:8082/")
public interface CardRest {

    @GetMapping("/list")
    List<CardDTO> getCards();

    @GetMapping("/list/sell")
    List<CardDTO> getSellCards();

    @GetMapping("/list/user")
    List<CardDTO> getUserCards(@CookieValue("session") long cookie);

    @PostMapping("/sell")
    Boolean sellCard(@RequestBody UserTransaction transaction);

    @PostMapping("/buy")
    Boolean buyCard(@RequestBody UserTransaction transaction);

}
