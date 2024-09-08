package com.cockatoo.domain.log.mapper;

import com.cockatoo.domain.log.dto.*;
import com.cockatoo.domain.log.entity.Log;

import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface LogMapper {

    @Mapping(source = "user", target = "user")
    @Mapping(source = "sound", target = "sound")
    @Mapping(source = "grade", target = "grade")
    CreateLogResponse logToCreateLogResponse(Log log);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "sound", target = "sound")
    @Mapping(source = "grade", target = "grade")
    ReadLogResponse logToReadLogResponse(Log log);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "sound", target = "sound")
    @Mapping(source = "grade", target = "grade")
    UpdateLogResponse toUpdateLogResponse(Log log);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "sound", ignore = true)
    @Mapping(target = "grade", ignore = true)
    Log createLogRequestToLog(CreateLogRequest request);

    @Mapping(source = "sound", target = "sound")
    @Mapping(source = "user", target = "user")
    @Mapping(source = "grade", target = "grade")
    LogDTOImpl logToDTO(Log log);

}