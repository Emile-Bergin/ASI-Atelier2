package fr.cpe.Lib.card;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "microservice-user", url = "http://card:8080/")
public interface CardRest {
}
