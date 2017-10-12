package wsib.on.ca.person.controller;

import java.util.logging.Logger;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	private static final Logger log = Logger.getLogger(PersonController.class.getName());
	
	
	@RequestMapping(
			value="/persons",
			method=RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public String getPersons() {
		log.info("getting person list");
		return "Hello World";
	}

}
