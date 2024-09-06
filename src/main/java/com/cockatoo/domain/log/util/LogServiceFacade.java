package com.cockatoo.domain.log.util;

import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.grade.service.GradeService;
import com.cockatoo.domain.log.dto.CreateLogRequest;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.log.mapper.LogMapper;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.sound.service.SoundService;
import com.cockatoo.domain.user.entity.User;
import com.cockatoo.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogServiceFacade {

    private final UserService userService;
    private final SoundService soundService;
    private final GradeService gradeService;

    private final LogMapper logMapper;


    public Log createLogWithDependencies(CreateLogRequest request) {

        User user = userService.readUser(request.getUserId()).getUser();
        Sound sound = soundService.readSound(request.getSoundId()).getSound();
        Grade grade = gradeService.readGrade(request.getGradeId()).getGrade();

        return logMapper.mapCreateLogRequest(request, user, sound, grade);
    }
}
