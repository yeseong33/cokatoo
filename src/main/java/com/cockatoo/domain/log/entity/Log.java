package com.cockatoo.domain.log.entity;


import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.user.entity.User;
import com.cockatoo.global.entity.Base;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Log")
public class Log extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @Column(name = "score")
    private float score;

    @Column(name = "record_sound")
    private String recordSound;

    @Column(name = "link")
    private String link;

    @NotNull(message = "유저는 필수로 연결되어야 합니다.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", updatable = false)
    private User user;

    @NotNull(message = "음원는 필수로 연결되어야 합니다.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sound_id", updatable = false)
    private Sound sound;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id", updatable = false)
    private Grade grade;

    @Builder
    public Log(Long logId, float score, String recordSound, String link, User user, Sound sound, Grade grade) {
        this.logId = logId;
        this.score = score;
        this.recordSound = recordSound;
        this.link = link;
        this.user = user;
        this.sound = sound;
        this.grade = grade;
    }
}
