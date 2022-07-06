package logging.mapper;

import org.mapstruct.Mapper;

import logging.entity.Opening;
import logging.model.OpeningResource;

@Mapper
public interface OpeningMapper {

	OpeningResource sourceToDestination(Opening source);

	Opening destinationToSource(OpeningResource destination);

}
