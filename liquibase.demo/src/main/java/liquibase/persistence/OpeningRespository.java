package liquibase.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

import liquibase.entity.Opening;

// the RevisionRepository ensures persistence of revisions of data takes place
public interface OpeningRespository{}
//		extends RevisionRepository<Opening, String, Integer>, JpaRepository<Opening, String> {
//
//}
