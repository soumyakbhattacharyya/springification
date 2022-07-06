package auditing.service;

import java.util.Optional;
import java.util.UUID;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import auditing.entity.Opening;
import auditing.mapper.OpeningMapper;
import auditing.model.OpeningResource;
import auditing.persistence.OpeningRespository;
import auditing.rest.error.types.TitleAlreadyExistsException;

@Service
@Transactional
public class OpeningService {

	@Autowired
	private OpeningRespository openingRespository;

	private OpeningMapper mapper = Mappers.getMapper(OpeningMapper.class);

	public OpeningResource persist(OpeningResource resource) {

		if ("DESIGNER".equalsIgnoreCase(resource.getTitle())) {
			throw new TitleAlreadyExistsException();
		}

//		Opening opening = new Opening();
//		opening.setId(UUID.randomUUID().toString());
//		opening.setTitle(resource.getTitle());
//		opening.setDescription(resource.getDescription());
		
		Opening destinationToSource = mapper.destinationToSource(resource);
		destinationToSource.setId(UUID.randomUUID().toString());

		Opening persistedOpening = openingRespository.save(destinationToSource);
		resource.setId(persistedOpening.getId());
		return resource;
	}
	
	public OpeningResource update(OpeningResource resource) {

		if ("DESIGNER".equalsIgnoreCase(resource.getTitle())) {
			throw new TitleAlreadyExistsException();
		}

//		Opening opening = new Opening();
//		opening.setId(UUID.randomUUID().toString());
//		opening.setTitle(resource.getTitle());
//		opening.setDescription(resource.getDescription());
		
		Optional<Opening> existingOpening = openingRespository.findById(resource.getId());
		
		
	    if (existingOpening.isPresent()) {
	    	existingOpening.get().setDescription(resource.getDescription());
	    }

		Opening persistedOpening = openingRespository.save(existingOpening.get());
		
		OpeningResource sourceToDestination = mapper.sourceToDestination(persistedOpening);
		
		return sourceToDestination;
	}
}
