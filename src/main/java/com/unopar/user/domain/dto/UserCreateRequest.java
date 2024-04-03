package com.unopar.user.domain.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Getter
public class UserCreateRequest {

    private String name;
    private String email;
    private String phone;
    private String password;
}
