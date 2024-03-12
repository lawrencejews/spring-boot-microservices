package com.lawrencejews.gamequestrewards;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GamerQuestService {

    private final GamerQuestRepo repository;

    public void saveGamer(GamerQuest gamer){
        repository.save(gamer);
    }

    public List<GamerQuest> findAllGamers(){
        return repository.findAll();
    }

//    public List<GamerQuest> findAllQuestsGamers(Integer user_id){
//        return repository.findAllByQuestId(user_id);
//    }
}
