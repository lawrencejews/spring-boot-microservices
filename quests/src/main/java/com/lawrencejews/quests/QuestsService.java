package com.lawrencejews.quests;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestsService {

    private final QuestsRepo repository;

    public void saveGamer(Quests gamer){
        repository.save(gamer);
    }

    public List<Quests> findAllGamers(){
        return repository.findAll();
    }
}
