package com.lawrencejews.gameusers;

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
public class Gamer {

    @Id
    @GeneratedValue
    private Integer user_id;
    private String username;
    private Integer gold;
    private Integer diamond;
    private Integer status;
}
