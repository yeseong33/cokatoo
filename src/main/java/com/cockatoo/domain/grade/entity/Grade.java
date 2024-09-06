package com.cockatoo.domain.grade.entity;

import com.cockatoo.domain.log.entity.Log;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
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
}
