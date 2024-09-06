package com.cockatoo.domain.log.service;

import com.cockatoo.domain.log.dto.*;

public interface LogService {

    CreateLogResponse createLog(CreateLogRequest request);
    ReadLogResponse readLog(Long id);
    UpdateLogResponse updateLog(Long id, UpdateLogRequest request);
}
