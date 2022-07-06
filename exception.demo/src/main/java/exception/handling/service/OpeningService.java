package exception.handling.service;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import exception.handling.entity.Opening;
import exception.handling.model.OpeningResource;
import exception.handling.persistence.OpeningRespository;
import exception.handling.rest.error.types.TitleAlreadyExistsException;

@Service
@Transactional
public class OpeningService {

	@Autowired
	private OpeningRespository openingRespository;

	public OpeningResource persist(OpeningResource resource) {
		
		if ("DESIGNER".equalsIgnoreCase(resource.getTitle())){
			throw new TitleAlreadyExistsException();
		}
		
		Opening opening = new Opening();
		opening.setId(UUID.randomUUID().toString());
		opening.setTitle(resource.getTitle());
		opening.setDescription(resource.getDescription());

		Opening persistedOpening = openingRespository.save(opening);
		resource.setId(persistedOpening.getId());
		return resource;
	}
}
