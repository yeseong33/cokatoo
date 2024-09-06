package com.cockatoo.domain.user.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UpdateUserRequest implements UserDTO {
    private Long userId;
    private String password;
    private String name;
    private String email;
    private LocalDateTime withdrawAt;
}
