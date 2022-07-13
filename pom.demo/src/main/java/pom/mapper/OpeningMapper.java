package pom.mapper;

import org.mapstruct.Mapper;
import pom.entity.Opening;
import pom.model.OpeningResource;

@Mapper
public interface OpeningMapper {
  OpeningResource sourceToDestination(Opening source);

  Opening destinationToSource(OpeningResource destination);
}
