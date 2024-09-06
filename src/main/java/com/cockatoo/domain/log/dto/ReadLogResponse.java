package com.cockatoo.domain.log.dto;

import com.cockatoo.domain.grade.dto.GradeDTO;
import com.cockatoo.domain.sound.dto.SoundDTO;
import com.cockatoo.domain.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReadLogResponse {
    private Long logId;
    private float score;
    private String recordSound;
    private String link;

    private UserDTO user;
    private SoundDTO sound;
    private GradeDTO grade;
}
