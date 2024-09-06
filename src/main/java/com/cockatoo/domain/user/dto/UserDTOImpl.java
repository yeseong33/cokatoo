package com.cockatoo.domain.user.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTOImpl implements UserDTO {
    private Long userId;
    private String password;
    private String name;
    private String email;
    private LocalDateTime startedAt;
    private LocalDateTime updatedAt;
    private LocalDateTime withdrawAt;
}
