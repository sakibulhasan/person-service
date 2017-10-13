package wsib.on.ca.person.converter;

import org.springframework.stereotype.Component;

import wsib.on.ca.person.model.Person;
import wsib.on.ca.person.model.dto.PersonDTO;

@Component
public class PersonConverter {
	
	public PersonDTO convert(Person person) {
		if (person == null) {
			return null;
		}
		
		PersonDTO dto = new PersonDTO();
		dto.setFirstName(person.getFirstName());
		dto.setLastName(person.getLastName());
		
		return dto;
	}

}
