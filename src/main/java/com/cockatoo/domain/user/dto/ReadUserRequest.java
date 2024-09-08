package com.cockatoo.domain.user.dto;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReadUserRequest {
    private Long id;
    private String name;
    private String email;

    @Builder
    public ReadUserRequest(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
