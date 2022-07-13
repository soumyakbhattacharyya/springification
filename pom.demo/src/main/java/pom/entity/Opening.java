package pom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import org.hibernate.envers.Audited;
import org.springframework.data.history.RevisionMetadata;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
// @Audited ensures that the entity data is audited
@Audited
public class Opening extends DateAudit {


  @Id
  @Column(nullable = false, updatable = false)
  private String id;

  @Column(nullable = false, unique = true, length = 150)
  private String title;

  @Column
  private String description;

  @Transient
  private RevisionMetadata<Integer> editVersion;

}
