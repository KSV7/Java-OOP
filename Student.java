package com.gmail.kutepov89.sergey;

public class Student extends Human {
	private int id;

	public Student(String firstName, String lastName, String patronymic, int age, boolean gender, int id) {
		super(firstName, lastName, patronymic, age, gender);
		this.id = id;
	}

	public Student(String firstName, String lastName, String patronymic, int age) {
		super(firstName, lastName, patronymic, age);
	}
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", patronymic="
				+ getPatronymic() + ", age=" + getAge() + ", gender=" + isGender() + "]";
	}

}