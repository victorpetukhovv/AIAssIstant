package com.aiassistant.aiassistant.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity(name = "user_")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    private String username;
    private String password;

}
