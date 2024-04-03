package com.unopar.user.domain.dto;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private String phone;

}
