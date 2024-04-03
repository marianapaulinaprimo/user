package com.unopar.user.resource;

import com.unopar.user.domain.dto.DetailsUserRequest;
import com.unopar.user.domain.dto.UserCreateRequest;
import com.unopar.user.domain.dto.UserResponse;
import com.unopar.user.domain.dto.UserUpdateRequest;
import com.unopar.user.entity.User;
import com.unopar.user.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    UserService service;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        var user = service.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> findAll() {

        List<UserResponse> response = service.findAll();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserCreateRequest createRequest)  {
        User createdUser = new User();
        BeanUtils.copyProperties(createRequest,createdUser);

        this.service.insert(createdUser);
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(createdUser, response);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id)  {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody UserUpdateRequest updateRequest) {
        var user = service.update(updateRequest);

        return ResponseEntity.ok(new DetailsUserRequest(user));
    }
}
