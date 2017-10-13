package wsib.on.ca.person.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import wsib.on.ca.person.model.Person;

@Component
public class PersonRepository {
	
	public List<Person> getPersons() {
		// this dummy data should be replaces by real database call
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Sakibul", "Hasan"));
		persons.add(new Person("Elon", "Musk"));
		persons.add(new Person("Larry", "Page"));
		persons.add(new Person("Larry", "Johnson"));
		persons.add(new Person("Harry", "Page"));
		persons.add(new Person("Mark", "Zukerberg"));
		persons.add(new Person("Jonathan", "Anderson"));
		persons.add(new Person("Joseph", "Avery"));
		persons.add(new Person("Joshua", "Bailey"));
		persons.add(new Person("Lucas", "Ball"));
		persons.add(new Person("Nathan", "Black"));
		persons.add(new Person("Nicholas", "Bond"));
		persons.add(new Person("Oliver", "Cameron"));
		persons.add(new Person("Owen", "Chapman"));
		persons.add(new Person("Nicholas", "Clark"));
		persons.add(new Person("Owen", "Coleman"));
		persons.add(new Person("Ian", "Davidson"));
		persons.add(new Person("Steven", "Dickens"));
		persons.add(new Person("Thomas", "Duncan"));
		persons.add(new Person("William", "Ferguson"));
		
		return persons;
	}

}
