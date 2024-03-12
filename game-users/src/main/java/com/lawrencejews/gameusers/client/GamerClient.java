package com.lawrencejews.gameusers.client;

import com.lawrencejews.gameusers.Gamer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "gamer-service", url = "${application.config.gamer-url}")
public interface GamerClient {
    @GetMapping("/quest/{user_id}")
    List<Gamer>findAllGamersByRewards(@PathVariable("user_id") Integer user_id);
}
