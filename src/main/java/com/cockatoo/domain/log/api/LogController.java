package com.cockatoo.domain.log.api;

import com.cockatoo.domain.log.dto.CreateLogRequest;
import com.cockatoo.domain.log.dto.CreateLogResponse;
import com.cockatoo.domain.log.dto.ReadLogResponse;
import com.cockatoo.domain.log.service.LogService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/log")
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @PostMapping("")
    ResponseEntity<CreateLogResponse> createLog(@Valid @RequestBody CreateLogRequest request) {
       CreateLogResponse response = logService.createLog(request);
       return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<ReadLogResponse> readLog(@PathVariable Long id) {
        ReadLogResponse response = logService.readLog(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(response);
    }

}
