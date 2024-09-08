package com.cockatoo.domain.sound.service;

import com.cockatoo.domain.sound.dto.SoundDTO;
import com.cockatoo.domain.sound.exception.SoundNameAlreadyExistsException;
import com.cockatoo.domain.sound.exception.SoundNotFoundException;
import com.cockatoo.domain.sound.repository.SoundRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SoundValidationService {

    private final SoundRepository soundRepository;

    void validateSound(SoundDTO request) {
        boolean sound = soundRepository.existsByName(request.getName());
        if (sound) {
            throw new SoundNameAlreadyExistsException();
        }
    }

    void validateSoundId(Long soundId) {
        boolean sound = soundRepository.existsBySoundId(soundId);
        if (!sound) {
            throw new SoundNotFoundException();
        }
    }

    public void checkSoundById(Long soundId) {
        if (soundRepository.existsBySoundId(soundId)) {
            throw new SoundNotFoundException();
        }
    }
}
