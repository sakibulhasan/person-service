package wsib.on.ca.person.model.dto;

import org.junit.Assert;
import org.junit.Test;

public class PersonDTOTest {

	private static final String FIRST_NAME = "Sakibul";
	private static final String LAST_NAME = "Hasan";

	@Test
	public void validatePersonDTOOverloadedConstructor() {
		PersonDTO dto = new PersonDTO(FIRST_NAME, LAST_NAME);
		
		Assert.assertEquals(FIRST_NAME, dto.getFirstName());
		Assert.assertEquals(LAST_NAME, dto.getLastName());
	}
	
}
