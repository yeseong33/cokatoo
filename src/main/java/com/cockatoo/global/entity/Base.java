package com.cockatoo.global.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public abstract class Base {

    @CreatedDate
    @Column(name = "date_created")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "date_updated")
    private LocalDateTime updatedAt;
}
