package exception.handling.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import exception.handling.entity.Opening;

public interface OpeningRespository extends JpaRepository<Opening, String> {

}
