package com.example.demo.jpa;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
@EqualsAndHashCode
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Column(name = "Created_At", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    protected Date createdDate;

    @Column(name = "Update_At")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    protected Date updateDate;

    @Column(name = "Status")
    @Enumerated(EnumType.ORDINAL)
    protected RecordState recordState = RecordState.ACTIVE;

}
