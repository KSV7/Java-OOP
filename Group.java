package com.gmail.kutepov89.sergey;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
<<<<<<< HEAD
	private String name;
=======
>>>>>>> c97d3f1d4d71740ea9f741e4e6eb3fbb7595b162
	private Student[] students = new Student[10];

	public Group(String name, Student[] students) {
		super();
		this.name = name;
		this.students = students;
	}
	
	public Group(String name) {
		super();
		this.name = name;
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

	public void sortStudentsByLastName(Student[] students) {
		Arrays.sort(students, Comparator.nullsFirst(new StudentLastNameComparator()));
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		sortStudentsByLastName(students);

		stringBuilder.append("\n");
		stringBuilder.append("Group name: "+ name);
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
