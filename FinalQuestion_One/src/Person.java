import java.util.UUID;

public class Person {
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public UUID getPersonID() {
		return PersonID;
	}

	public void setPersonID(UUID personID) {
		PersonID = UUID.randomUUID();
	}

	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	// Default Constructor
	Person () {	
	}
	
	

}