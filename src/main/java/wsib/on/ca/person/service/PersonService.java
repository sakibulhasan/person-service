package wsib.on.ca.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import wsib.on.ca.person.data.PersonRepository;
import wsib.on.ca.person.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public List<Person> getPersons(String search) {
		if (StringUtils.isEmpty(search)) {
			return repository.getPersons();
		} else {
			return repository.getPersons(search);
		}
		
	}

}
