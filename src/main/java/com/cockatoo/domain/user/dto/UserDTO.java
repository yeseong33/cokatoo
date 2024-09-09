package com.cockatoo.domain.user.dto;

import java.time.LocalDateTime;

public interface UserDTO {
    String getPassword();
    String getName();
    String getEmail();
    LocalDateTime getWithdrawAt();
}
