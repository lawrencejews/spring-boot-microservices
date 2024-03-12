package com.lawrencejews.quests;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Quests {

    @Id
    @GeneratedValue
    private Integer quest_id;
    private String name;
    private String description;
    private Integer duplication;
    private Boolean auto_claim;
    private Integer streak;
}
