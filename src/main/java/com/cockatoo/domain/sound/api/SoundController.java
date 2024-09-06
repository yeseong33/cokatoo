package com.cockatoo.domain.sound.api;


import com.cockatoo.domain.sound.dto.*;
import com.cockatoo.domain.sound.service.SoundService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/sound")
@RequiredArgsConstructor
public class SoundController {

    private final SoundService soundService;

    @PostMapping("")
    ResponseEntity<CreateSoundResponse> createSound(@Valid @RequestBody CreateSoundRequest createSoundRequest) {
        CreateSoundResponse createSoundResponse = soundService.createSound(createSoundRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createSoundResponse);
    }

    @GetMapping("/{soundId}")
    ResponseEntity<ReadSoundResponse> readSound(@Valid @PathVariable Long soundId) {
        ReadSoundResponse response = soundService.readSound(soundId);
        return ResponseEntity.status(HttpStatus.FOUND).body(response);
    }

    @PatchMapping("/{soundId}")
    ResponseEntity<UpdateSoundResponse> updateSound(@Valid @PathVariable Long soundId, @Valid @RequestBody UpdateSoundRequest request) {
        UpdateSoundResponse response = soundService.updateSound(soundId, request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{soundId}")
    ResponseEntity<DeleteSoundResponse> deleteSound(@Valid @PathVariable Long soundId) {
        DeleteSoundResponse response = soundService.deleteSound(soundId);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


}
