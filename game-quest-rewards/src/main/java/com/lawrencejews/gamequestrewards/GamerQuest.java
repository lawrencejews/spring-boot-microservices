package com.lawrencejews.gamequestrewards;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamerQuest {

    @Id
    @GeneratedValue
    private Integer gamer_quest_id;
    private Integer user_id;
    private Integer status;
    private Timestamp date;

}
