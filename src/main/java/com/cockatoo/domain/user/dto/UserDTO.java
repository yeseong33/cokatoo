package com.cockatoo.domain.user.dto;

import java.time.LocalDateTime;

public interface UserDTO {
    Long getUserId();
    String getPassword();
    String getName();
    String getEmail();
    LocalDateTime getWithdrawAt();
}
