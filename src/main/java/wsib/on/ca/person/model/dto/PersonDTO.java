package wsib.on.ca.person.model.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable {
	
	private static final long serialVersionUID = 7584457866771848984L;

	private String firstName;
	private String lastName;
	
	
	public PersonDTO() {
		
	}
	
	public PersonDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
