package com.lawrencejews.rewards;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rewards")
@RequiredArgsConstructor
public class RewardsController {

    private final RewardsService service;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody Rewards gamer){
        service.saveGamer(gamer);
    }

    @GetMapping
    public ResponseEntity<List<Rewards>> findAllGamers(){
        return ResponseEntity.ok(service.findAllGamers());
    }

}
