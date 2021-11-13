package com.gmail.kutepov89.sergey;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private String name;
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

	public void saveListStudentsToFile(String fileName) {
		String res = "";
		StringBuilder stringBuilder = new StringBuilder();
		sortStudentsByLastName(students);

		for (Student s : students) {
			if (s != null) {
				stringBuilder
						.append(s.getLastName() + " " + s.getFirstName() + " " + s.getPatronymic() + " " + s.getAge())
						.append("\n");
			}
		}
		res = stringBuilder.toString();

		try (PrintWriter a = new PrintWriter(fileName)) {
			a.println(res);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}
	}

	public void readListStudentsFromFile(String fileName, Group group) {
		try (BufferedReader f = new BufferedReader(new FileReader(fileName))) {
			String str = "";
			for (; (str = f.readLine()) != null;) {
				if (!str.isEmpty()) {
					String[] student = str.split(" ");
					Student st = new Student(student[0], student[1], student[2], Integer.parseInt(student[3]), true, 1);
					group.add(st);
				}
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		sortStudentsByLastName(students);

		stringBuilder.append("\n");
		stringBuilder.append("Group name: " + name);
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