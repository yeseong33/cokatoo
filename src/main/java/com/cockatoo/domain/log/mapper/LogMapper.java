package com.cockatoo.domain.log.mapper;

import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.log.dto.CreateLogRequest;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogMapper {

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "sound", ignore = true)
    @Mapping(target = "grade", ignore = true)
    Log createLogRequestToLog(CreateLogRequest request);

    default Log mapCreateLogRequest(CreateLogRequest request, User user, Sound sound, Grade grade) {
        Log log = createLogRequestToLog(request);
        log.setUser(user);
        log.setSound(sound);
        log.setGrade(grade);
        return log;
    }
}