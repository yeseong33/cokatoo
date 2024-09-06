package com.cockatoo.domain.user.dto;

import com.cockatoo.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReadUserResponse {
    private User user;
}
