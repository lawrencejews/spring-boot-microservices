package com.lawrencejews.gameusers;

import com.lawrencejews.gameusers.client.GamerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GamerService {

    private final GamerRepo repository;
    private GamerClient Client;

    public void saveGamer(Gamer gamer){
        repository.save(gamer);
    }

    public List<Gamer> findAllGamers(){
        return repository.findAll();
    }

    public QuestResponse findQuestGamers(Integer  user_id){
        var gamer = repository.findById(user_id)
                .orElse(Gamer.builder()
                        .username("NOT_FOUND")
                        .build());
// Find all the quest rewards between microservices
        var user_quest = Client.findAllGamersByRewards( user_id );
        return QuestResponse.builder()
                .username(gamer.getUsername())
                .build();
    }
}
