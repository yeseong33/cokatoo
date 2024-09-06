package com.cockatoo.domain.log.util;

import com.cockatoo.domain.grade.repository.GradeRepository;
import com.cockatoo.domain.log.dto.CreateLogRequest;
import com.cockatoo.domain.log.dto.CreateLogResponse;
import com.cockatoo.domain.log.mapper.LogMapper;
import com.cockatoo.domain.log.repository.LogRepository;
import com.cockatoo.domain.sound.repository.SoundRepository;
import com.cockatoo.domain.user.repository.UserRepository;
import com.cockatoo.global.error.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogRepositoryFacade {
    private final LogRepository repository;
    private final UserRepository userRepository;
    private final SoundRepository soundRepository;
    private final GradeRepository gradeRepository;

    public void validateLogWithDependencies(CreateLogRequest request) {
        boolean user = userRepository.existsById(request.getUserId());
        boolean sound = soundRepository.existsById(request.getSoundId());
        boolean grade = gradeRepository.existsById(request.getGradeId());

        if (!user || !sound || !grade) {
            throw new NotFoundException();
        }
    }


}
