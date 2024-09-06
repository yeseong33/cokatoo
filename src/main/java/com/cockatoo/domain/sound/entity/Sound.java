package com.cockatoo.domain.sound.entity;


import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.global.entity.Base;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "sound")
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

}
