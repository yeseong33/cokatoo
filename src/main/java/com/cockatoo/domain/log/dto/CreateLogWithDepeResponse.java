package com.cockatoo.domain.log.dto;

import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreateLogWithDepeResponse {
    private User user;
    private Sound sound;
    private Grade grade;

    @Builder
    public CreateLogWithDepeResponse(User user, Sound sound, Grade grade) {
        this.user = user;
        this.sound = sound;
        this.grade = grade;
    }
}
