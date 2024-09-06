package com.cockatoo.domain.log.util;

import com.cockatoo.domain.log.dto.UpdateLogRequest;
import com.cockatoo.domain.log.entity.Log;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogUtil {

    // mapper 기능을 임의로 구현한 것
    public Log updateDTOToLog(UpdateLogRequest request, Log log) {
        if (request == null) {
            return log;
        }
        return Log.builder()
                .logId(log.getLogId())
                .score(request.getScore())
                .recordSound(request.getRecordSound() != null ? request.getRecordSound() : log.getRecordSound())
                .link(request.getLink() != null ? request.getLink() : log.getLink())
                .user(log.getUser())
                .sound(log.getSound())
                .grade(log.getGrade())
                .build();
    }
}
