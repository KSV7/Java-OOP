package com.gmail.kutepov89.sergey;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentFactory {

	public static void addStudent(Group group) {
		Student st = new Student();
		st.setFirstName(inputFirstName());
		st.setLastName(inputLastName());
		st.setPatronymic(inputPatronymic());
		st.setAge(inputAge());
		group.add(st);
	}

	public static String inputFirstName() {
		while (true) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Input firstname");
				return sc.nextLine();
			} catch (Exception e) {
				return "Input error";
			}
		}
	}

	public static String inputLastName() {
		while (true) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Input lastname");
				return sc.nextLine();
			} catch (Exception e) {
				return "Input error";
			}
		}
	}

	public static String inputPatronymic() {
		while (true) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Input patronymic");
				return sc.nextLine();
			} catch (Exception e) {
				return "Input error";
			}
		}
	}

	public static int inputAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input age");
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.print("That’s not an integer. Try again: ");
			}
		}
	}

}