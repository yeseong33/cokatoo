package com.cockatoo.domain.user.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDTOImpl implements UserDTO {
    private Long userId;
    private String password;
    private String name;
    private String email;
    private LocalDateTime startedAt;
    private LocalDateTime updatedAt;
    private LocalDateTime withdrawAt;

    @Builder

    public UserDTOImpl(Long userId, String password, String name, String email, LocalDateTime startedAt, LocalDateTime updatedAt, LocalDateTime withdrawAt) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
        this.startedAt = startedAt;
        this.updatedAt = updatedAt;
        this.withdrawAt = withdrawAt;
    }
}
