package liquibase.mapper;

import org.mapstruct.Mapper;

import liquibase.entity.Opening;
import liquibase.model.OpeningResource;

@Mapper
public interface OpeningMapper {

	OpeningResource sourceToDestination(Opening source);

	Opening destinationToSource(OpeningResource destination);

}
