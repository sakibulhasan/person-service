package wsib.on.ca.person.data;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import wsib.on.ca.person.model.Person;

public class PersonRepositoryTest {
	
	@InjectMocks
	private PersonRepository repository;
	
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void validateGetPersonsNoParameter() {
		List<Person> persons = repository.getPersons();

		Assert.assertEquals(21, persons.size());
		Assert.assertEquals("Sakibul", persons.get(0).getFirstName());
		Assert.assertEquals("Hasan", persons.get(0).getLastName());
	}

	@Test
	public void validateGetPersonsForParamAS() {
		List<Person> persons = repository.getPersons("as");
		
		Assert.assertEquals(5, persons.size());
		Assert.assertEquals("Sakibul", persons.get(0).getFirstName());
		Assert.assertEquals("Hasan", persons.get(0).getLastName());
	}
	
	@Test
	public void validateGetPersonsForParamRR() {
		List<Person> persons = repository.getPersons("rr");
		
		Assert.assertEquals(3, persons.size());
		Assert.assertEquals("Larry", persons.get(0).getFirstName());
		Assert.assertEquals("Page", persons.get(0).getLastName());
	}
	
	@Test
	public void validateGetPersonsForParamZukerberg() {
		List<Person> persons = repository.getPersons("zukerberg");
		
		Assert.assertEquals(1, persons.size());
		Assert.assertEquals("Mark", persons.get(0).getFirstName());
		Assert.assertEquals("Zukerberg", persons.get(0).getLastName());
	}
	
}
