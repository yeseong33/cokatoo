package com.cockatoo.domain.sound.dto;

import com.cockatoo.domain.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SoundDTOImpl implements SoundDTO {
    private Long soundId;
    private String name;
    private String path;
    private String thumbnail;
    private Integer like;
    private String origin;
}
