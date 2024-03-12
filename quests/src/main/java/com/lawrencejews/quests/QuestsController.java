package com.lawrencejews.quests;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quests")
@RequiredArgsConstructor
public class QuestsController {

    private final QuestsService service;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody Quests gamer){
        service.saveGamer(gamer);
    }

    @GetMapping
    public ResponseEntity<List<Quests>> findAllGamers(){
        return ResponseEntity.ok(service.findAllGamers());
    }

}
