package com.cockatoo.domain.log.dto;


import com.cockatoo.domain.sound.dto.SoundDTOImpl;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReadAllLogResponse {

    private List<LogDTOImpl> logs;

    @Builder
    public ReadAllLogResponse(List<LogDTOImpl> logs) {
        this.logs = logs;
    }
}
