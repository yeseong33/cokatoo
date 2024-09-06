package com.cockatoo.domain.user.dto;

import com.cockatoo.domain.user.entity.User;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReadUserResponse {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private LocalDateTime withdrawAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public ReadUserResponse(Long userId, String name, String email, String password, LocalDateTime withdrawAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.withdrawAt = withdrawAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
