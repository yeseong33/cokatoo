package com.cockatoo.domain.log.service;

import com.cockatoo.domain.log.dto.*;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.log.exception.LogNotFoundException;
import com.cockatoo.domain.log.mapper.LogMapper;
import com.cockatoo.domain.log.repository.LogRepository;
import com.cockatoo.domain.log.util.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;
    private final LogValidationService logValidationService;
    private final LogMapper logMapper;
    private final LogServiceFacade logServiceFacade;
    private final LogValidationServiceFacade serviceValidationFacade;
    private final LogMapperFacade logMapperFacade;
    private final LogRepositoryFacade logRepositoryFacade;
    private final LogUtil logUtil;

    @Override
    public CreateLogResponse createLog(CreateLogRequest request) {
        serviceValidationFacade.validateLogWithDependencies(request);
        Log log = logMapper.createLogRequestToLog(request);
        log = logRepositoryFacade.createLogWithDependencies(request, log);
        logRepository.save(log);
        CreateLogResponse response = logMapper.logToCreateLogResponse(log);
        return response;
    }

    @Override
    public ReadLogResponse readLog(Long id) {
        logValidationService.validateLogById(id);
        Log log = logRepository.findById(id).orElseThrow(LogNotFoundException::new);
        ReadLogResponse response = logMapper.logToReadLogResponse(log);
        return response;
    }

    @Override
    @Transactional
    public UpdateLogResponse updateLog(Long logId, UpdateLogRequest request) {
        logValidationService.validateLogById(logId);
        Log log = logRepository.findById(logId).orElseThrow(LogNotFoundException::new);
        log.update(request);
//        Log upadtedLog = logUtil.updateDTOToLog(request, log);
//        logRepository.save(upadtedLog);
        UpdateLogResponse response = logMapper.toUpdateLogResponse(log);
        return response;
    }

    @Override
    public DeletedLogResponse deleteLog(Long id) {
        logValidationService.validateLogById(id);
        logRepository.deleteById(id);
        return new DeletedLogResponse(id);
    }
}
