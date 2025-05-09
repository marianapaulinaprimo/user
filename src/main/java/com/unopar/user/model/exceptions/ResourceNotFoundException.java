package com.unopar.user.model.exceptions;

import com.unopar.user.model.enumeration.UserErrorEnum;
import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(UserErrorEnum errorEnum) {
        super(errorEnum.getMessage());
    }
}