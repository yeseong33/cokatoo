package com.cockatoo.domain.sound.entity;


import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.sound.dto.UpdateSoundRequest;
import com.cockatoo.domain.user.dto.UpdateUserRequest;
import com.cockatoo.global.entity.Base;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "sound")
@ToString
public class Sound extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sound_id")
    private Long soundId;

    @NotNull(message = "Name must not be null")
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull(message = "path must not be null")
    @Column(name = "path", nullable = false)
    private String path;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "likes")
    private Integer like = 0;

    @Column(name = "origin")
    private String origin;

    @OneToMany(mappedBy = "sound", fetch = FetchType.LAZY)
    private List<Log> logs;

    @Builder
    public Sound(Long soundId, String name, String path, String thumbnail, Integer like, String origin, List<Log> logs) {
        this.soundId = soundId;
        this.name = name;
        this.path = path;
        this.thumbnail = thumbnail;
        this.like = like;
        this.origin = origin;
        this.logs = logs;
    }


    public void update(UpdateSoundRequest request) {
        if (request.getName() != null) {
            this.name = request.getName();
        }
        if (request.getPath() != null) {
            this.path = request.getPath();
        }
        if (request.getThumbnail() != null) {
            this.thumbnail = request.getThumbnail();
        }
        if (request.getLike() != null) {
            this.like = request.getLike();
        }
        if (request.getOrigin() != null) {
            this.origin = request.getOrigin();
        }

    }
}
