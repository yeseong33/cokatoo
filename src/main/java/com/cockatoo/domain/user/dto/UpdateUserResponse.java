package com.cockatoo.domain.user.dto;


import com.cockatoo.domain.user.entity.User;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateUserResponse {
    private User user;

    @Builder
    public UpdateUserResponse(User user) {
        this.user = user;
    }
}
