package com.cockatoo.domain.grade.api;

import com.cockatoo.domain.grade.dto.CreateGradeRequest;
import com.cockatoo.domain.grade.dto.CreateGradeResponse;
import com.cockatoo.domain.grade.dto.EvaluateGradeResponse;
import com.cockatoo.domain.grade.dto.ReadGradeResponse;
import com.cockatoo.domain.grade.service.GradeService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/v1/grade")
@RequiredArgsConstructor
public class GradeController {

    private final GradeService gradeService;

    @PostMapping("")
    ResponseEntity<CreateGradeResponse> createGrade(@Valid @RequestBody CreateGradeRequest request) {
        CreateGradeResponse response = gradeService.createGrade(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<ReadGradeResponse> createGrade(@Valid @PathVariable Long id) {
        ReadGradeResponse response = gradeService.readGrade(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/evaluate")
    ResponseEntity<EvaluateGradeResponse> evaluateGrade(@PathParam("score") Double score) {
        EvaluateGradeResponse response = gradeService.evaluateGrade(score);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}

