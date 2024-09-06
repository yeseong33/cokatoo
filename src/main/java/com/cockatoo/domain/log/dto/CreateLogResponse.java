package com.cockatoo.domain.log.dto;

import com.cockatoo.domain.grade.dto.GradeDTO;
import com.cockatoo.domain.sound.dto.SoundDTO;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateLogResponse {

    private float score;
    private String recordSound;
    private String link;

    private UserDTO user;
    private SoundDTO sound;
    private GradeDTO grade;

}
