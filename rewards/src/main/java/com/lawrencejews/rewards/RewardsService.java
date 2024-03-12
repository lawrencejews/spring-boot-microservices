package com.lawrencejews.rewards;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RewardsService {

    private final RewardsRepo repository;

    public void saveGamer(Rewards gamer){
        repository.save(gamer);
    }

    public List<Rewards> findAllGamers(){
        return repository.findAll();
    }
}
