package com.cockatoo.domain.user.dto;


import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeletedUserResponse {
    private Long userId;

    @Builder
    public DeletedUserResponse(Long userId) {
        this.userId = userId;
    }
}
