package com.cockatoo.domain.user.service;

import com.cockatoo.domain.user.dto.UserDTO;
import com.cockatoo.domain.user.exception.EmailAlreadyExistsException;
import com.cockatoo.domain.user.exception.UserNameAlreadyExistsException;
import com.cockatoo.domain.user.exception.UserNotFoundException;
import com.cockatoo.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserValidationService {

    private final UserRepository userRepository;


    public void validateUser(UserDTO request) {
        final String email = request.getEmail();
        final String name = request.getName();
        checkEmail(email);
        checkName(name);
    }

    public void checkEmail(String email) {
        final boolean existsByUserName = userRepository.existsByEmail(email);

        if (existsByUserName) {
            throw new EmailAlreadyExistsException();
        }
    }

    public void checkName(String name) {
        final boolean existsByUserName = userRepository.existsByName(name);

        if (existsByUserName) {
            throw new UserNameAlreadyExistsException();
        }
    }

    public void checkUserById(Long userId) {
        final boolean existsByUserId = userRepository.existsByUserId(userId);
        if (!existsByUserId) {
            throw new UserNotFoundException();
        }
    }
}
