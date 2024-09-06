package com.cockatoo.domain.user.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateUserRequest implements UserDTO {
    private Long userId;
    private String password;
    private String name;
    private String email;
    private LocalDateTime withdrawAt;

    @Builder
    public UpdateUserRequest(Long userId, String password, String name, String email, LocalDateTime withdrawAt) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
        this.withdrawAt = withdrawAt;
    }
}
