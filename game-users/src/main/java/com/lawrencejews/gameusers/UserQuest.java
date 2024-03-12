package com.lawrencejews.gameusers;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserQuest {
    private String username;
    private Integer gold;
    private Integer diamond;
    private Integer status;
}
