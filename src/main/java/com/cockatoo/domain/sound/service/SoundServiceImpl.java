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
        System.out.println(sound.toString());
        soundRepository.save(sound);
        return new CreateSoundResponse(sound);
    }

    @Override
    public ReadSoundResponse readSound(Long soundId) {
        soundValidationService.validateSoundId(soundId);
        Sound sound = soundRepository.findById(soundId).orElseThrow(SoundNotFoundException::new);
        return new ReadSoundResponse(sound);
    }

    @Override
    public UpdateSoundResponse updateSound(Long soundId, UpdateSoundRequest request) {
        soundValidationService.validateSoundId(soundId);
        Sound sound = soundRepository.findById(soundId).orElseThrow(SoundNotFoundException::new);
        soundMapper.updateSoundToDto(request, sound);
        soundRepository.save(sound);
        return new UpdateSoundResponse(sound);
    }

    @Override
    public DeleteSoundResponse deleteSound(Long soundId) {
        soundValidationService.validateSoundId(soundId);
        soundRepository.deleteById(soundId);
        return new DeleteSoundResponse(soundId);
    }
}
