package com.cockatoo.domain.log.util;

import com.cockatoo.domain.grade.service.GradeService;
import com.cockatoo.domain.sound.service.SoundService;
import com.cockatoo.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogServiceFacade {

    private final UserService userService;
    private final SoundService soundService;
    private final GradeService gradeService;

}
