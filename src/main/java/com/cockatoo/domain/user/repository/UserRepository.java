package com.cockatoo.domain.user.repository;

import com.cockatoo.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUserId(Long userId);
    boolean existsByEmail(String email);
    boolean existsByName(String name);
}
