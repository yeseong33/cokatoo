package com.cockatoo.domain.sound.repository;

import com.cockatoo.domain.sound.entity.Sound;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoundRepository extends JpaRepository<Sound, Long> {
    boolean existsByName(String name);
    boolean existsBySoundId(Long soundId);

}
