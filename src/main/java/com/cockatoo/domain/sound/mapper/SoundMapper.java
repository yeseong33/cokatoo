package com.cockatoo.domain.sound.mapper;


import com.cockatoo.domain.sound.dto.*;
import com.cockatoo.domain.sound.entity.Sound;
import org.mapstruct.*;


@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SoundMapper {

    CreateSoundResponse soundToCreateSoundResponse(Sound sound);

    ReadSoundResponse soundToReadSoundResponse(Sound sound);

    UpdateSoundResponse toUpdateSoundResponse(Sound sound);

    Sound createDTOToSound(CreateSoundRequest createSoundRequest);

}
