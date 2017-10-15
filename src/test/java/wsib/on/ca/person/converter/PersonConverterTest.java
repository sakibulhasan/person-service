package wsib.on.ca.person.converter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import wsib.on.ca.person.model.Person;
import wsib.on.ca.person.model.dto.PersonDTO;

public class PersonConverterTest {
	
	private static final String FIRST_NAME = "Sakibul";
	private static final String LAST_NAME = "Hasan";

	@InjectMocks
	private PersonConverter converter;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void validateConvert() {
		Person person = new Person(FIRST_NAME, LAST_NAME);
		
		PersonDTO dto = converter.convert(person);
		Assert.assertEquals(FIRST_NAME, dto.getFirstName());
		Assert.assertEquals(LAST_NAME, dto.getLastName());
	}
	
	@Test
	public void validateConvertForNullParameter() {
		Person person = null;
		
		PersonDTO dto = converter.convert(person);
		Assert.assertEquals(null, dto);
	}
	
}
