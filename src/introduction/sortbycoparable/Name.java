package introduction.sortbycoparable;

public class Name implements Comparable<Name>{
	public String firstName;
	public String lastName;
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
	public Name(String lastName,String firstName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public int compareTo(Name o) {
		int lastCmp = lastName.compareTo(o.lastName);
		return lastCmp!=0?lastCmp:firstName.compareTo(o.firstName);
	}
	@Override
	public String toString() {
		return "Name [lastName=" + lastName + ",firstName=" + firstName + "]";
	}
}
