package com.cockatoo.domain.sound.service;

import com.cockatoo.domain.sound.dto.*;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.sound.exception.SoundNotFoundException;
import com.cockatoo.domain.sound.mapper.SoundMapper;
import com.cockatoo.domain.sound.repository.SoundRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class SoundServiceImpl implements SoundService {

    private final SoundValidationService soundValidationService;
    private final SoundMapper soundMapper;
    private final SoundRepository soundRepository;

    @Override
    public CreateSoundResponse createSound(CreateSoundRequest createSoundRequest) {
        soundValidationService.validateSound(createSoundRequest);
        Sound sound = soundMapper.createDTOToSound(createSoundRequest);
        soundRepository.save(sound);
        CreateSoundResponse response = soundMapper.soundToCreateSoundResponse(sound);
        return response;
    }

    @Override
    public ReadSoundResponse readSound(Long soundId) {
        soundValidationService.validateSoundId(soundId);
        Sound sound = soundRepository.findById(soundId).orElseThrow(SoundNotFoundException::new);
        ReadSoundResponse response = soundMapper.soundToReadSoundResponse(sound);
        return response;
    }

    @Override
    public UpdateSoundResponse updateSound(Long soundId, UpdateSoundRequest request) {
        soundValidationService.validateSoundId(soundId);
        Sound sound = soundRepository.findById(soundId).orElseThrow(SoundNotFoundException::new);
        Sound updatedSound = soundMapper.updateDTOToSound(request, sound);
        soundRepository.save(updatedSound);
        UpdateSoundResponse response = soundMapper.soundToUpdateSoundResponse(sound);
        return response;
    }

    @Override
    public DeleteSoundResponse deleteSound(Long soundId) {
        soundValidationService.validateSoundId(soundId);
        soundRepository.deleteById(soundId);
        return new DeleteSoundResponse(soundId);
    }
}
