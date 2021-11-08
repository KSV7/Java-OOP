package com.gmail.kutepov89.sergey;

import java.util.Arrays;

public class Group {
	private Student[] students = new Student[10];

	public Group(Student[] students) {
		super();
		this.students = students;
	}

	public Group() {
		super();
	}

	public void add(Student student) {
		for (int i = 0;; i++) {
			try {
				if (i >= students.length) {
					throw new FullGroupException();
				}

				if (students[i] == null) {
					students[i] = student;
					break;
				}
			} catch (FullGroupException e) {
				System.err.println(e.getMessage());
				break;
			}
		}
	}

	public String del(String lastName) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getLastName().equalsIgnoreCase(lastName)) {
				students[i] = null;
				return "студент " + lastName + " удален";
			}
		}
		return "Такого студента нет в списке";
	}

	public Student searchByLastName(String lastName) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getLastName().equalsIgnoreCase(lastName)) {
				return students[i];
			}
		}
		return null;
	}

	public void sortByLastName(Student[] students) {
		Student temp;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				for (int j = 0; j < students.length - 1; j++) {
					if (students[j] != null && students[j + 1] != null) {
						if (students[j].getLastName().compareToIgnoreCase(students[j + 1].getLastName()) > 0) {
							temp = students[j];
							students[j] = students[j + 1];
							students[j + 1] = temp;
						}
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		sortByLastName(students);

		stringBuilder.append("\n");
		for (Student s : students) {
			if (s != null) {
				stringBuilder.append(s.getLastName() + " " + s.getFirstName() + " (age: " + s.getAge() + ")")
						.append("\n");
			}
		}
		stringBuilder.append("\n");

		return stringBuilder.toString();
	}

}
