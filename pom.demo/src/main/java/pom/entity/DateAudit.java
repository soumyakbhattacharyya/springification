package pom.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * DateAudit is a super class to add creation and updating timestamps.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class DateAudit implements Serializable {
  @CreatedDate
  @Column(name = "created_at", nullable = false, updatable = false)
  private Date createdAt;

  @LastModifiedDate
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;
}
