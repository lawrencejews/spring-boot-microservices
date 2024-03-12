package com.lawrencejews.gameusers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-gamers")
@RequiredArgsConstructor
public class GamerController {

    private final GamerService service;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody Gamer gamer){
        service.saveGamer(gamer);
    }

    @GetMapping
    public ResponseEntity<List<Gamer>> findAllGamers(){
        return ResponseEntity.ok(service.findAllGamers());
    }

    @GetMapping("/quest/{user_id}")
    public ResponseEntity<QuestResponse> findAllGamers( @PathVariable("user_id") Integer user_id){
        return ResponseEntity.ok(service.findQuestGamers( user_id));

    }

}
