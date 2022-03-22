package lesson11.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName,lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		Key k = (Key) obj;
		//return Objects.equals(firstName,k.firstName) && Objects.equals(lastName,k.lastName);
		return firstName.equals(k.firstName) && lastName.equals(k.firstName);
	}
}
