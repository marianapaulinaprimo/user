package com.unopar.user.services;

import com.unopar.user.domain.dto.UserResponse;
import com.unopar.user.domain.dto.UserUpdateRequest;
import com.unopar.user.entity.User;

import java.util.List;

public interface UserService {

    List<UserResponse> findAll();

    User findById(Long id);

    User insert(User user);

    User update(UserUpdateRequest updateRequest);

    void delete(Long id);
}
