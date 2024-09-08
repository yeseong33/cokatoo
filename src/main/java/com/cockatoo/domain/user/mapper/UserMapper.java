package com.cockatoo.domain.user.mapper;

import com.cockatoo.domain.user.dto.*;
import com.cockatoo.domain.user.entity.User;
import org.mapstruct.*;

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
