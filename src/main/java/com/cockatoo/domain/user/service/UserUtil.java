package com.cockatoo.domain.user.service;

import com.cockatoo.domain.log.dto.UpdateLogRequest;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.user.dto.UpdateUserRequest;
import com.cockatoo.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserUtil {

    // mapper 기능을 임의로 구현한 것
    public User updateUser(UpdateUserRequest request, User user) {
        if (request == null) {
            return user;
        }
        return User.builder()
                .userId(user.getUserId())
                .password(request.getPassword() != null ? request.getPassword() : user.getPassword())
                .name(request.getName() != null ? request.getName() : user.getName())
                .email(request.getEmail() != null ? request.getEmail() : user.getEmail())
                .withdrawAt(request.getWithdrawAt() != null ? request.getWithdrawAt() : user.getWithdrawAt())
                .logs(user.getLogs())
                .build();
    }
}