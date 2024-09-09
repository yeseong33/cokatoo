package com.cockatoo.domain.user.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateUserRequest implements UserDTO {
    private String name;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime withdrawAt;

    @Builder
    public CreateUserRequest(String name, String email, String password, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime withdrawAt) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.withdrawAt = withdrawAt;
    }
}
