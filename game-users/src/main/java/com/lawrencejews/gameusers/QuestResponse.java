package com.lawrencejews.gameusers;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestResponse {
    private String username;
    private Integer gold;
    private Integer diamond;
    private Integer status;

    List<UserQuest> userQuest;
}
