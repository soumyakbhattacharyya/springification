package liquibase.rest;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import liquibase.model.OpeningResource;
import liquibase.service.OpeningService;

//@RestController
//@RequestMapping(value = "/api/openings", produces = MediaType.APPLICATION_JSON_VALUE)
public class OpeningController {

//	private final OpeningService openingService;
//
//	public OpeningController(final OpeningService openingService) {
//		this.openingService = openingService;
//	}
//
//	@PostMapping
//	public ResponseEntity<OpeningResource> createOpening(@RequestBody @Valid final OpeningResource openingDTO) {
//		return new ResponseEntity<OpeningResource>(openingService.persist(openingDTO), HttpStatus.CREATED);
//	}
//	
//	@PutMapping
//	public ResponseEntity<OpeningResource> updateOpening(@RequestBody @Valid final OpeningResource openingDTO) {
//		return new ResponseEntity<OpeningResource>(openingService.update(openingDTO), HttpStatus.OK);
//	}


}