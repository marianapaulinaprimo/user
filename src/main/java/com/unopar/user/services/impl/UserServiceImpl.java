package com.unopar.user.services.impl;

import com.unopar.user.domain.dto.UserResponse;
import com.unopar.user.domain.dto.UserUpdateRequest;
import com.unopar.user.domain.enumeration.UserErrorEnum;
import com.unopar.user.entity.User;
import com.unopar.user.repository.UserRepository;
import com.unopar.user.services.UserService;
import com.unopar.user.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserResponse> findAll() {

        List<User> entityList = userRepository.findAll();

        return entityList.stream().map(item -> {
            UserResponse userResponse = new UserResponse();
            BeanUtils.copyProperties(item, userResponse);
            return userResponse;
        }).collect(Collectors.toList());
    }

    @Override
    public User findById(Long id) throws ResourceNotFoundException {

        try {
            Optional<User> userOpt = this.userRepository.findById(id);
            return userOpt.get();

        } catch (Exception e) {
            throw new ResourceNotFoundException(UserErrorEnum.USER_NOT_FOUND);
        }

    }

    @Override
    public User insert(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User update(UserUpdateRequest updateRequest) throws ResourceNotFoundException{
        validationInput(updateRequest);

        try {
            User user = findById(updateRequest.getId());
            user.setEmail(updateRequest.getEmail());
            user.setPhone(updateRequest.getPhone());
            user.setName(updateRequest.getName());
            return this.userRepository.save(user);

        } catch (Exception e){
            throw new ResourceNotFoundException(UserErrorEnum.UPDATE_ERROR);
        }
    }

    @Override
    public void delete(Long id) throws ResourceNotFoundException {
        User user = findById(id);
        try {
            userRepository.delete(user);
        } catch (Exception e) {
            throw new ResourceNotFoundException(UserErrorEnum.DELETE_ERROR);
        }
    }

    public void validationInput(UserUpdateRequest request) throws ResourceNotFoundException {

        if(request == null){

            throw new ResourceNotFoundException(UserErrorEnum.REQUEST_IS_REQUIRED);
        }
        if (request.getId() == null){
            throw new ResourceNotFoundException(UserErrorEnum.ID_IS_REQUIRED);
        }
        if (request.getName().isBlank() || request.getName().isEmpty()){
            throw new ResourceNotFoundException(UserErrorEnum.NAME_IS_REQUIRED);
        }
        if (request.getPhone().isBlank() || request.getPhone().isEmpty()){
            throw new ResourceNotFoundException(UserErrorEnum.PHONE_IS_REQUIRED);
        }
    }

}
