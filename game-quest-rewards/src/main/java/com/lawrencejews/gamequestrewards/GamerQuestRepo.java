package com.lawrencejews.gamequestrewards;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GamerQuestRepo extends JpaRepository<GamerQuest, Integer> {
//    List<GamerQuest> findAllByQuestId(Integer user_id);
}
