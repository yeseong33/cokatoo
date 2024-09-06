package com.cockatoo.domain.sound.mapper;


import com.cockatoo.domain.sound.dto.*;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.user.dto.UpdateUserRequest;
import com.cockatoo.domain.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SoundMapper {

    SoundDTOImpl soundDTO(Sound sound);

    Sound createDTOToSound(CreateSoundRequest createSoundRequest);
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updateSoundToDto(UpdateSoundRequest request, @MappingTarget Sound sound);


}
