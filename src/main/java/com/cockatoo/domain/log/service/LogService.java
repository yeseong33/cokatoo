package com.cockatoo.domain.log.service;

import com.cockatoo.domain.log.dto.CreateLogRequest;
import com.cockatoo.domain.log.dto.CreateLogResponse;
import com.cockatoo.domain.log.dto.ReadLogResponse;

public interface LogService {

    CreateLogResponse createLog(CreateLogRequest request);
    ReadLogResponse readLog(Long id);
}
