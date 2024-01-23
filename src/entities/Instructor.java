package entities;

public class Instructor {
	private String name;
	private String surname;
	private String email;
	private double age;
	
	public Instructor(String name, String surname, String email, double age) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
	
	
}
