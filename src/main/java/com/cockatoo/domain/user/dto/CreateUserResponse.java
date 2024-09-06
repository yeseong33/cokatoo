package com.cockatoo.domain.user.dto;

import com.cockatoo.domain.user.entity.User;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateUserResponse {
    private User user;

    @Builder
    public CreateUserResponse(User user) {
        this.user = user;
    }
}