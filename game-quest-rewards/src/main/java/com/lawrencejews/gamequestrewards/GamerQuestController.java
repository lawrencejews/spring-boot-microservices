package com.lawrencejews.gamequestrewards;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/gamers-quest")
@RequiredArgsConstructor
public class GamerQuestController {

    private final GamerQuestService service;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody GamerQuest gamer){
        service.saveGamer(gamer);
    }

    @GetMapping
    public ResponseEntity<List<GamerQuest>> findAllGamers(){
        return ResponseEntity.ok(service.findAllGamers());
    }

//    @GetMapping("/quest/{user_id}")
//    public ResponseEntity<List<GamerQuest>> findAllGamers(@PathVariable("user_id") Integer user_id){
//        return ResponseEntity.ok(service.findAllQuestsGamers(user_id));
//    }

}
