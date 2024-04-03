package com.unopar.user.services.exceptions;

import com.unopar.user.domain.enumeration.UserErrorEnum;
import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(UserErrorEnum errorEnum) {
        super(errorEnum.getMessage());
    }
}