package com.example.demo.domain;

import com.example.demo.domain.dto.CommentRequestDto;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Timestamped {

    @CreatedDate
    @Column(name = "create_date")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "update_date")
    private LocalDateTime modifiedAt;

}
