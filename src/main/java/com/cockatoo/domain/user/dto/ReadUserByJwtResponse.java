package com.cockatoo.domain.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ReadUserByJwtResponse {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private LocalDateTime withdrawAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public ReadUserByJwtResponse(Long userId, String name, String email, String password, LocalDateTime withdrawAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.withdrawAt = withdrawAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
