package com.cockatoo.domain.log.api;

import com.cockatoo.domain.log.dto.*;
import com.cockatoo.domain.log.service.LogService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/api/v1/log")
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

    @PatchMapping("/{id}")
    ResponseEntity<UpdateLogResponse> updateLog(@PathVariable Long id, @Valid @RequestBody UpdateLogRequest request) {
        UpdateLogResponse response = logService.updateLog(id, request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<DeletedLogResponse> deleteLog(@PathVariable Long id) {
        DeletedLogResponse response = logService.deleteLog(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/scores")
    void readAllScore(HttpServletResponse response) throws IOException {
        logService.readAllScore(response);
    }

}
