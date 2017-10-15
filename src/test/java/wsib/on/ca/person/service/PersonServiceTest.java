package wsib.on.ca.person.service;

import static org.mockito.Mockito.when;
import static org.mockito.Matchers.any;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import wsib.on.ca.person.data.PersonRepository;
import wsib.on.ca.person.model.Person;

public class PersonServiceTest {
	
	@InjectMocks
	private PersonService service;
	
	@Mock
	private PersonRepository repository;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void validateGetPersonsForNull() {
		when(repository.getPersons()).thenReturn(PERSONS);
		
		List<Person> persons = service.getPersons(null);
		Assert.assertEquals(3, persons.size());
	}

	@Test
	public void validateGetPersonsForNonNull() {
		when(repository.getPersons(any(String.class))).thenReturn(PERSONS_SEARCHED);
		
		List<Person> persons = service.getPersons("Page");
		Assert.assertEquals(1, persons.size());
		Assert.assertEquals("Larry", persons.get(0).getFirstName());
		Assert.assertEquals("Page", persons.get(0).getLastName());
	}
	
	
	private static final List<Person> PERSONS;
	private static final List<Person> PERSONS_SEARCHED;
	
	static {
		PERSONS = new ArrayList<>();
		PERSONS.add(new Person("Sakibul", "Hasan"));
		PERSONS.add(new Person("Larry", "Page"));
		PERSONS.add(new Person("Bill", "Gates"));

		PERSONS_SEARCHED = new ArrayList<>();
		PERSONS_SEARCHED.add(new Person("Larry", "Page"));
	}
}
