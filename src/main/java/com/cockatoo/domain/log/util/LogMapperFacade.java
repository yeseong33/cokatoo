package com.cockatoo.domain.log.util;

import com.cockatoo.domain.grade.mapper.GradeMapper;
import com.cockatoo.domain.log.mapper.LogMapper;
import com.cockatoo.domain.sound.mapper.SoundMapper;
import com.cockatoo.domain.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LogMapperFacade {

    private final UserMapper userMapper;
    private final SoundMapper soundMapper;
    private final GradeMapper gradeMapper;
    private final LogMapper logMapper;



}
