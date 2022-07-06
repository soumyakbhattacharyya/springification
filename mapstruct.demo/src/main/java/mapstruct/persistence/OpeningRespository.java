package mapstruct.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import mapstruct.entity.Opening;

public interface OpeningRespository extends JpaRepository<Opening, String> {
	
	

}
