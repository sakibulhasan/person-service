package wsib.on.ca.person.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import wsib.on.ca.person.converter.PersonConverter;
import wsib.on.ca.person.model.Person;
import wsib.on.ca.person.model.dto.PersonDTO;
import wsib.on.ca.person.service.PersonService;

public class PersonControllerTest {
	
	@InjectMocks
	private PersonController controller;
	
	@Mock
	private PersonService service;
	
	@Mock
	private PersonConverter converter;

	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void validateGetPersonsForNull() {
		when(service.getPersons(any(String.class))).thenReturn(PERSONS);
		when(converter.convert(any(Person.class))).thenReturn(new PersonDTO());
		
		List<PersonDTO> dtos = controller.getPersons("searchKey");
		Assert.assertEquals(3, dtos.size());
	}

	
	private static final List<Person> PERSONS;
	
	static {
		PERSONS = new ArrayList<>();
		PERSONS.add(new Person("Sakibul", "Hasan"));
		PERSONS.add(new Person("Larry", "Page"));
		PERSONS.add(new Person("Bill", "Gates"));
	}
}
