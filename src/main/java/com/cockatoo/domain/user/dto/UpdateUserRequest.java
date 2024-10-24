package com.cockatoo.domain.user.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class UpdateUserRequest implements UserDTO {
    private String password;
    private String name;
    private String email;
    private LocalDateTime withdrawAt;

    @Builder
    public UpdateUserRequest( String password, String name, String email, LocalDateTime withdrawAt) {
        this.password = password;
        this.name = name;
        this.email = email;
        this.withdrawAt = withdrawAt;
    }
}
