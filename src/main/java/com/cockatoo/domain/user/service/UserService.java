package com.cockatoo.domain.user.service;

import com.cockatoo.domain.user.dto.*;

public interface UserService {

    CreateUserResponse createUser(CreateUserRequest createUserRequest);
    ReadUserResponse readUser(Long userId);
    UpdateUserResponse updateUser(Long userId, UpdateUserRequest updateUserRequest);
    DeletedUserResponse deleteUser(Long userId);
    ReadUserByJwtResponse readUserByJwt(String userEmail);
}
