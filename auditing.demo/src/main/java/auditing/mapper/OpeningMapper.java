package auditing.mapper;

import org.mapstruct.Mapper;

import auditing.entity.Opening;
import auditing.model.OpeningResource;

@Mapper
public interface OpeningMapper {

	OpeningResource sourceToDestination(Opening source);

	Opening destinationToSource(OpeningResource destination);

}
