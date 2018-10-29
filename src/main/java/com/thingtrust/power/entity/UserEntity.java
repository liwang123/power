package com.thingtrust.power.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserEntity {
    private String username;

    private String password;
}
