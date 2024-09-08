package com.cockatoo.domain.log.util;

import com.cockatoo.domain.grade.service.GradeValidationService;
import com.cockatoo.domain.log.dto.CreateLogRequest;
import com.cockatoo.domain.log.service.LogValidationService;
import com.cockatoo.domain.sound.service.SoundValidationService;
import com.cockatoo.domain.user.service.UserValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogValidationServiceFacade {

    private final UserValidationService userValidationService;
    private final SoundValidationService soundValidationService;
    private final GradeValidationService gradeValidationService;
    private final LogValidationService logValidationService;

    public void validateLogWithDependencies(CreateLogRequest request) {

        userValidationService.checkUserById(request.getUserId());
        soundValidationService.checkSoundById(request.getSoundId());
        gradeValidationService.checkGradeById(request.getGradeId());

    }



}
