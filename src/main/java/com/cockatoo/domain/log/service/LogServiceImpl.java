package com.cockatoo.domain.log.service;

import com.cockatoo.domain.log.dto.*;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.log.exception.LogNotFoundException;
import com.cockatoo.domain.log.mapper.LogMapper;
import com.cockatoo.domain.log.repository.LogRepository;
import com.cockatoo.domain.log.util.LogMapperFacade;
import com.cockatoo.domain.log.util.LogServiceFacade;
import com.cockatoo.domain.log.util.LogValidationServiceFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;
    private final LogValidationService logValidationService;
    private final LogMapper logMapper;
    private final LogServiceFacade logServiceFacade;
    private final LogValidationServiceFacade serviceValidationFacade;
    private final LogMapperFacade logMapperFacade;

    @Override
    public CreateLogResponse createLog(CreateLogRequest request) {
        serviceValidationFacade.validateLogWithDependencies(request);
        Log log = logServiceFacade.createLogWithDependencies(request);
        logRepository.save(log);
        CreateLogResponse response = logMapperFacade.logToResponse(log, CreateLogResponse.class);
        return response;
    }

    @Override
    public ReadLogResponse readLog(Long id) {
        logValidationService.validateLogById(id);
        Log log = logRepository.findById(id).orElseThrow(LogNotFoundException::new);
        ReadLogResponse response = logMapperFacade.logToResponse(log, ReadLogResponse.class);
        return response;
    }

    @Override
    public UpdateLogResponse updateLog(Long logId, UpdateLogRequest request) {
        logValidationService.validateLogById(logId);
        Log log = logRepository.findById(logId).orElseThrow(LogNotFoundException::new);
        logMapper.updateLogFromDTO(request, log);
        Log updatedLog = logRepository.save(log);
        UpdateLogResponse response = logMapperFacade.logToResponse(updatedLog, UpdateLogResponse.class);
        return response;
    }

    @Override
    public DeletedLogResponse deleteLog(Long id) {
        logValidationService.validateLogById(id);
        logRepository.deleteById(id);
        return new DeletedLogResponse(id);
    }
}
