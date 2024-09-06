package com.cockatoo.domain.user.entity;

import com.cockatoo.domain.log.entity.Log;
import com.cockatoo.global.entity.Base;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends Base {

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
    public User(String password, String name, String email, LocalDateTime withdrawAt) {
        this.password = password;
        this.name = name;
        this.email = email;
        this.withdrawAt = withdrawAt;
    }

}
