package com.cockatoo.domain.sound.service;

import com.cockatoo.domain.sound.dto.*;

public interface SoundService {

    CreateSoundResponse createSound(CreateSoundRequest createSoundRequest);
    ReadSoundResponse readSound(Long soundId);
    UpdateSoundResponse updateSound(Long soundId, UpdateSoundRequest request);
    DeleteSoundResponse deleteSound(Long soundId);
}
