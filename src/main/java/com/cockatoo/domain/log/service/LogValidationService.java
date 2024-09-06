package com.cockatoo.domain.log.service;

import com.cockatoo.domain.log.exception.LogNotFoundException;
import com.cockatoo.domain.log.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogValidationService {

    private final LogRepository logRepository;


    public void validateLogById(Long id) {
        boolean log = logRepository.existsById(id);
        if (!log) {
            throw new LogNotFoundException();
        }
    }
}
