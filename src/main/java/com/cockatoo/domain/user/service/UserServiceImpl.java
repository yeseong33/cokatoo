package com.cockatoo.domain.user.service;


import com.cockatoo.domain.user.dto.*;
import com.cockatoo.domain.user.exception.UserNotFoundException;
import com.cockatoo.domain.user.mapper.UserMapper;
import com.cockatoo.domain.user.repository.UserRepository;
import com.cockatoo.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserValidationService userValidationService;
    private final UserMapper userMapper;


    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {

        userValidationService.validateUser(createUserRequest);

        final User user = userMapper.convertToUser(createUserRequest);

//        User user = User.builder()
//                .userId(createUserDTO.getUserId())
//                .name(createUserDTO.getName())
//                .email(createUserDTO.getEmail())
//                .password(createUserDTO.getPassword())
//                .withdrawAt(createUserDTO.getWithdrawAt())
//                .build();
        userRepository.save(user);
        return new CreateUserResponse(user);
    }


    public ReadUserResponse readUser(Long userId) {
        userValidationService.checkUserById(userId);
        final User user = userRepository.findById(userId)
                .orElseThrow(UserNotFoundException::new);
        ReadUserResponse response = userMapper.readUserResponse(user);
        return response;
    }


    public UpdateUserResponse updateUser(Long userId, UpdateUserRequest updateUserRequest) {
        User user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        userMapper.updateUserFromDto(updateUserRequest, user);
        User updatedUser = userRepository.save(user);
        return new UpdateUserResponse(updatedUser);
    }

    @Override
    public DeletedUserResponse deleteUser(Long userId) {
        userValidationService.checkUserById(userId);
        userRepository.deleteById(userId);
        return userMapper.deletedUserToDto(userId);
    }

}
