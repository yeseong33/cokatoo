package com.cockatoo.domain.user.service;


import com.cockatoo.domain.jwt.service.JwtService;
import com.cockatoo.domain.user.dto.*;
import com.cockatoo.domain.user.exception.UserNotFoundException;
import com.cockatoo.domain.user.mapper.UserMapper;
import com.cockatoo.domain.user.repository.UserRepository;
import com.cockatoo.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserValidationService userValidationService;
    private final UserMapper userMapper;
    private final UserUtil userUtil;

    public CreateUserResponse createUser(CreateUserRequest request) {

        userValidationService.validateUser(request);

        User user = User.builder()
//                .userId(createUserRequest.getUserId())
                .name(request.getName())
                .email(request.getEmail())
                .withdrawAt(request.getWithdrawAt())
                .password(userUtil.encodePassword(request.getPassword())) // Set encoded password
                .build();

        userRepository.save(user);
        CreateUserResponse response = userMapper.toCreateUserResponse(user);
        return response;
    }


    public ReadUserResponse readUser(Long userId) {
        userValidationService.checkUserById(userId);
        final User user = userRepository.findById(userId)
                .orElseThrow(UserNotFoundException::new);
        ReadUserResponse response = userMapper.readUserResponse(user);
        return response;
    }


    @Override
    @Transactional
    public UpdateUserResponse updateUser(Long userId, UpdateUserRequest request) {
//        userValidationService.validateUser(request);
        User user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        user.update(request);
        UpdateUserResponse response = userMapper.toUpdateUserResponse(user);
        return response;
    }

    @Override
    public DeletedUserResponse deleteUser(Long userId) {
        userValidationService.checkUserById(userId);
        userRepository.deleteById(userId);
        return userMapper.deletedUserToDto(userId);
    }

    @Override
    public ReadUserByJwtResponse readUserByJwt(String userEmail) {
        User user = findByEmail(userEmail);
        return userMapper.readUserByJwtResponse(user);
    }

    private User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(UserNotFoundException::new);
    }

}
