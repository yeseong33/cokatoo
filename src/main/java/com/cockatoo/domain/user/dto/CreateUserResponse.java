package com.cockatoo.domain.user.dto;

import com.cockatoo.domain.user.entity.User;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse {
    private User user;
}