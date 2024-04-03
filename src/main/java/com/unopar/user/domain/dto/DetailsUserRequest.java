package com.unopar.user.domain.dto;

import com.unopar.user.entity.User;

public record DetailsUserRequest (Long id, String name, String email, String phone){
    public DetailsUserRequest(User user) {
        this(user.getId(), user.getName(), user.getEmail(), user.getPhone());
    }
}
