package inheritance;

public class Actor {
	String firstName;
	String lastname;
	Integer birthyear;

	public Actor(String firstName, String lastname, Integer birthyear) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.birthyear = birthyear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(Integer birthyear) {
		this.birthyear = birthyear;
	}

	@Override
	public String toString() {
		return "Actor [firstName=" + firstName + ", lastname=" + lastname + ", birthyear=" + birthyear + "]";
	}

	public static void main(String[] args) {
		Actor actor1 = new Actor("Vidhya", "Amarnath", 1990);
		Actor actor2 = new Actor("Akshara", "Kovoor", 2017);
		System.out.println(actor1.getBirthyear());
		System.out.println(actor1.getFirstName());
		System.out.println(actor2.getFirstName());
		System.out.println(actor1);

	}

}
