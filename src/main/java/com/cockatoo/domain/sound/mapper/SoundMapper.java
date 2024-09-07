package com.cockatoo.domain.sound.mapper;


import com.cockatoo.domain.log.dto.CreateLogResponse;
import com.cockatoo.domain.log.dto.LogDTOImpl;
import com.cockatoo.domain.log.dto.UpdateLogRequest;
import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.log.mapper.LogMapper;
import com.cockatoo.domain.sound.dto.*;
import com.cockatoo.domain.sound.entity.Sound;
import com.cockatoo.domain.user.dto.UpdateUserRequest;
import com.cockatoo.domain.user.entity.User;
import com.cockatoo.domain.user.mapper.UserMapper;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SoundMapper {

    CreateSoundResponse soundToCreateSoundResponse(Sound sound);

    ReadSoundResponse soundToReadSoundResponse(Sound sound);

    UpdateSoundResponse soundToUpdateSoundResponse(Sound sound);

    Sound createDTOToSound(CreateSoundRequest createSoundRequest);

    default Sound updateDTOToSound(UpdateSoundRequest request, Sound sound) {
        if (request == null) {
            return sound;
        }

        Sound updated = Sound.builder()
                .soundId(sound.getSoundId())
                .name(request.getName())
                .path(request.getPath())
                .thumbnail(request.getThumbnail() != null ? request.getThumbnail() : sound.getThumbnail())
                .like(request.getLike())
                .origin(request.getOrigin() != null ? request.getOrigin() : sound.getOrigin())
                .logs(sound.getLogs())
                .build();

        System.out.println(updated.toString());
        return updated;
    }

}
