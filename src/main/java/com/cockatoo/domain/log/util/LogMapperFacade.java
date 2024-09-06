package com.cockatoo.domain.log.util;

import com.cockatoo.domain.grade.dto.GradeDTO;
import com.cockatoo.domain.grade.mapper.GradeMapper;
import com.cockatoo.domain.log.dto.CreateLogResponse;
import com.cockatoo.domain.log.dto.ReadLogResponse;
import com.cockatoo.domain.log.dto.UpdateLogResponse;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.log.mapper.LogMapper;
import com.cockatoo.domain.sound.dto.SoundDTO;
import com.cockatoo.domain.sound.mapper.SoundMapper;
import com.cockatoo.domain.sound.service.SoundService;
import com.cockatoo.domain.user.dto.UserDTO;
import com.cockatoo.domain.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LogMapperFacade {

    private final UserMapper userMapper;
    private final SoundMapper soundMapper;
    private final GradeMapper gradeMapper;
    private final LogMapper logMapper;

    public <T> T logToResponse(Log log, Class<T> responseType) {
        UserDTO userDTO = userMapper.userDTO(log.getUser());
        SoundDTO soundDTO = soundMapper.soundDTO(log.getSound());
        GradeDTO gradeDTO = gradeMapper.gradeDTO(log.getGrade());

        if (responseType.equals(CreateLogResponse.class)) {
            return responseType.cast(new CreateLogResponse(log.getScore(), log.getRecordSound(), log.getLink(), userDTO, soundDTO, gradeDTO));
        } else if (responseType.equals(ReadLogResponse.class)) {
            return responseType.cast(new ReadLogResponse(log.getLogId(), log.getScore(), log.getRecordSound(), log.getLink(), userDTO, soundDTO, gradeDTO));
        } else if (responseType.equals(UpdateLogResponse.class)) {
            return responseType.cast(new UpdateLogResponse(log.getScore(), log.getRecordSound(), log.getLink(),log.getUpdatedAt(), userDTO, soundDTO, gradeDTO));
        } else {
            throw new IllegalArgumentException("Unsupported response type: " + responseType);
        }
    }

}
