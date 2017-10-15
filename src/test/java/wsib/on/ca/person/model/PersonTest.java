package wsib.on.ca.person.model;

import org.junit.Test;
import org.junit.Assert;

public class PersonTest {

	private static final String FIRST_NAME = "Sakibul";
	private static final String LAST_NAME = "Hasan";

	@Test
	public void validatePersonOverloadedConstructor() {
		Person p = new Person(FIRST_NAME, LAST_NAME);
		
		Assert.assertEquals(FIRST_NAME, p.getFirstName());
		Assert.assertEquals(LAST_NAME, p.getLastName());
	}
	
}
