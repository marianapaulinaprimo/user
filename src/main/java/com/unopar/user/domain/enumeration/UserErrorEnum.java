package com.unopar.user.domain.enumeration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum UserErrorEnum {

    USER_NOT_FOUND("001", "User not found"),
    ID_IS_REQUIRED("002", "User is required"),
    NAME_IS_REQUIRED("003", "Name is required"),
    PHONE_IS_REQUIRED("004", "Phone is required"),
    UPDATE_ERROR("005", "Update error"),
    DELETE_ERROR("005", "Delete error"),
    REQUEST_IS_REQUIRED("006", "Request is required");

    private final String code;
    private final String message;


}
