package com.unopar.user.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserUpdateRequest {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
