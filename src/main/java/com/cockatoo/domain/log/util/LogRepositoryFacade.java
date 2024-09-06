package com.cockatoo.domain.log.util;

import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.grade.exception.GradeNotFoundException;
import com.cockatoo.domain.grade.repository.GradeRepository;
import com.cockatoo.domain.log.dto.CreateLogRequest;
import com.cockatoo.domain.log.dto.CreateLogWithDepeResponse;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.log.repository.LogRepository;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.sound.exception.SoundNotFoundException;
import com.cockatoo.domain.sound.repository.SoundRepository;
import com.cockatoo.domain.user.entity.User;
import com.cockatoo.domain.user.exception.UserNotFoundException;
import com.cockatoo.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogRepositoryFacade {
    private final LogRepository repository;
    private final UserRepository userRepository;
    private final SoundRepository soundRepository;
    private final GradeRepository gradeRepository;



    public Log createLogWithDependencies(CreateLogRequest request, Log log) {

        User user = userRepository.findById(request.getUserId()).orElseThrow(UserNotFoundException::new);
        Sound sound = soundRepository.findById(request.getSoundId()).orElseThrow(SoundNotFoundException::new);
        Grade grade = gradeRepository.findById(request.getGradeId()).orElseThrow(GradeNotFoundException::new);

        // 빌더를 사용하여 Log 엔티티를 재구성합니다.
        log = Log.builder()
                .logId(log.getLogId()) // 기존 ID가 있을 경우 유지
                .score(log.getScore())
                .recordSound(log.getRecordSound())
                .link(log.getLink())
                .user(user)
                .sound(sound)
                .grade(grade)
                .build();

        return log;
    }


}
