package wsib.on.ca.person.controller;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wsib.on.ca.person.converter.PersonConverter;
import wsib.on.ca.person.model.dto.PersonDTO;
import wsib.on.ca.person.service.PersonService;

@RestController
public class PersonController {
	
	private static final Logger log = Logger.getLogger(PersonController.class.getName());
	
	@Autowired
	private PersonService service;
	
	@Autowired
	private PersonConverter converter;
	
	@RequestMapping(
			value="/persons",
			method=RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PersonDTO> getPersons() {
		log.info("getting person list");
		
		List<PersonDTO> personDTOs = service.getPersons().stream()
                .map((person) -> converter.convert(person))
                .collect(Collectors.toList());
		
		return personDTOs;
	}

}
