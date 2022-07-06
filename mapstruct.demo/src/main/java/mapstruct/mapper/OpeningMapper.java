package mapstruct.mapper;

import org.mapstruct.Mapper;

import mapstruct.entity.Opening;
import mapstruct.model.OpeningResource;

@Mapper
public interface OpeningMapper {

	OpeningResource sourceToDestination(Opening source);

	Opening destinationToSource(OpeningResource destination);

}
