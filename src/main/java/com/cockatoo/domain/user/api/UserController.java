package com.cockatoo.domain.user.api;

import com.cockatoo.domain.jwt.service.JwtService;
import com.cockatoo.domain.user.dto.*;
import com.cockatoo.domain.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final JwtService jwtService;

    @PostMapping("")
    public ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
        final CreateUserResponse createUserResponse = userService.createUser(createUserRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createUserResponse);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ReadUserResponse> readUser(@PathVariable Long userId) {
        final ReadUserResponse readUserResponse = userService.readUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body(readUserResponse);
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<UpdateUserResponse> updateUser(@PathVariable Long userId, @Valid @RequestBody UpdateUserRequest updateUserRequest) {
        final UpdateUserResponse updateUserResponse = userService.updateUser(userId, updateUserRequest);
        return ResponseEntity.status(HttpStatus.OK).body(updateUserResponse);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<DeletedUserResponse> deleteUser(@PathVariable Long userId) {
        final DeletedUserResponse deletedUserResponse = userService.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body(deletedUserResponse);
    }

    @GetMapping("")
    public ResponseEntity<ReadUserByJwtResponse> readUserByJwt(@RequestHeader("Authorization") String jwt) {
        final String userEmail = jwtService.extractUsername(jwt);
        final ReadUserByJwtResponse response = userService.readUserByJwt(userEmail);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
