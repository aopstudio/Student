
public class Student {
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName(){
		return firstName+" "+lastName;
	}
}
