package com.cockatoo.domain.user.entity;

import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.domain.user.dto.UpdateUserRequest;
import com.cockatoo.global.entity.Base;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends Base implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @NotNull(message = "password must not be null")
    @Column(name = "password")
    private String password;

    @NotNull(message = "name must not be null")
    @Column(name = "name")
    private String name;

    @NotNull(message = "email must not be null")
    @Column(name = "email")
    private String email;

    @Column(name = "date_withdraw", nullable = true)
    private LocalDateTime withdrawAt;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Log> logs;

    @Builder

    public User(Long userId, String password, String name, String email, LocalDateTime withdrawAt, List<Log> logs) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
        this.withdrawAt = withdrawAt;
        this.logs = logs;
    }

    public void update(UpdateUserRequest request) {
        if (request.getPassword() != null) {
            this.password = request.getPassword();
        }
        if (request.getName() != null) {
            this.name = request.getName();
        }
        if (request.getEmail() != null) {
            this.email = request.getEmail();
        }
        if (request.getWithdrawAt() != null) {
            this.withdrawAt = request.getWithdrawAt();
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return this.email;
    }
}
