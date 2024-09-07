package com.cockatoo.domain.grade.entity;

import com.cockatoo.domain.log.entity.Log;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeId;

    @NotNull
    @Column(name="tier", nullable = false)
    private String tier;

    @Column(name="path", nullable = false)
    private String path;

    @OneToMany(mappedBy = "grade", fetch = FetchType.LAZY)
    private List<Log> logs;

    @Builder
    public Grade(Long gradeId, String tier, String path, List<Log> logs) {
        this.gradeId = gradeId;
        this.tier = tier;
        this.path = path;
        this.logs = logs;
    }
}
