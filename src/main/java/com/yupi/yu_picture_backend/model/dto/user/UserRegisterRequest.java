package com.yupi.yu_picture_backend.model.dto.user;

import lombok.Data;

@Data
public class UserRegisterRequest {

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
