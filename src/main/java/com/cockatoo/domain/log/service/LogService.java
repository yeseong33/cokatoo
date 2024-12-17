package com.cockatoo.domain.log.service;

import com.cockatoo.domain.log.dto.*;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface LogService {

    CreateLogResponse createLog(CreateLogRequest request);
    ReadLogResponse readLog(Long id);
    UpdateLogResponse updateLog(Long id, UpdateLogRequest request);
    DeletedLogResponse deleteLog(Long id);
    void readAllScore(HttpServletResponse response) throws IOException;
}
