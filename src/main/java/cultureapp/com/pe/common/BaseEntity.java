package cultureapp.com.pe.common;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(nullable = false, name = "fecha_creacion", updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(name = "fecha_modificacion", insertable = false)
    private LocalDateTime lastModifiedDate;

    @CreatedBy
    @Column(name = "usuario_registro", nullable = false, updatable = false)
    private Integer createdBy;

    @LastModifiedBy
    @Column(name = "usuario_modificacion",insertable = false)
    private Integer lastModifiedBy;
}
