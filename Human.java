package com.gmail.kutepov89.sergey;

public class Human {
	private String firstName;
	private String lastName;
	private String patronymic;
	private int age;
	private boolean gender;
	
	public Human(String firstName, String lastName, String patronymic, int age, boolean gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymic = patronymic;
		this.age = age;
		this.gender = gender;
	}
	
	public Human(String firstName, String lastName, String patronymic, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymic = patronymic;
		this.age = age;
	}
	
	public Human() {
		super();
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
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + ", patronymic=" + patronymic + ", age="
				+ age + ", gender=" + gender + "]";
	}

}