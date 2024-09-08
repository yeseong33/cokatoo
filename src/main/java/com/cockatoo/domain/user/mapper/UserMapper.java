package com.cockatoo.domain.user.mapper;

import com.cockatoo.domain.grade.dto.GradeDTO;
import com.cockatoo.domain.grade.entity.Grade;
import com.cockatoo.domain.sound.dto.UpdateSoundResponse;
import com.cockatoo.domain.user.dto.*;
import com.cockatoo.domain.user.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {

    User convertToUser(CreateUserRequest createUserRequest);

    UserDTOImpl userDTO(User user);

    ReadUserResponse readUserResponse(User user);

    UpdateUserResponse toUpdateUserResponse(User user);

    @Mapping(target = "userId", source = "userId")
    DeletedUserResponse deletedUserToDto(Long userId);

}
