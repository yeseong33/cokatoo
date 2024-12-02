package com.cockatoo.domain.user.mapper;

import com.cockatoo.domain.user.dto.*;
import com.cockatoo.domain.user.entity.User;
import org.mapstruct.*;
import org.springframework.security.crypto.password.PasswordEncoder;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {


    @Mapping(target = "userId", ignore = true)
    CreateUserResponse toCreateUserResponse(User user);

    User convertToUser(CreateUserRequest createUserRequest);

    UserDTOImpl userDTO(User user);

    ReadUserResponse readUserResponse(User user);

    UpdateUserResponse toUpdateUserResponse(User user);

    @Mapping(target = "userId", source = "userId")
    DeletedUserResponse deletedUserToDto(Long userId);

    ReadUserByJwtResponse readUserByJwtResponse(User user);


}
