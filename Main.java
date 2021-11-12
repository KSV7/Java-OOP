package com.gmail.kutepov89.sergey;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Student st = new Student("Vasya", "Vasiliev", "Davidovich", 21, true, 1);
//		Student st2 = new Student("Alex", "Alexgov", "Alexsandrovich", 32, true, 2);
//
//		Student st3 = new Student("Serg", "Williams", "Sergeevich", 23, true, 3);
//		Student st4 = new Student("Ben", "Peters", "Petrovich", 24, true, 4);
//
//		Student st5 = new Student("Tom", "Gibson", "Tomsovich", 19, true, 5);
//		Student st6 = new Student("Andrey", "Martin", "Andreevich", 20, true, 6);
//
//		Student st7 = new Student("Vitaliy", "Jordan", "Vitalievich", 26, true, 7);
//		Student st8 = new Student("John", "Jackson", "Jonsovich", 31, true, 8);
//
//		Student st9 = new Student("Oleg", "Grant", "Olegovich", 30, true, 9);
//		Student st10 = new Student("Igor", "Davis", "Igorevich", 22, true, 10);
//
//		Student st11 = new Student("Vlad", "Lewis", "Vladimirovich", 21, true, 11);
//
//		Group group = new Group("First group");
//
//		group.add(st);
//		group.add(st2);
//		group.add(st3);
//		group.add(st4);
//		group.add(st5);
//		group.add(st6);
//		group.add(st7);
//		group.add(st8);
//		group.add(st9);
//		group.add(st10);
//		group.add(st11);
//
//		System.out.println(group.del("Lewis"));
//
//		System.out.println(group.searchByLastName("Gibson"));
//
//		System.out.println(group.del("Williams"));
//		System.out.println();
//
//		System.out.println("Сортировка студентов с помощью Comparator:");
//		System.out.println(group);

		Group group2 = new Group("Second group");

		StudentFactory.addStudent(group2);
		
		System.out.println(group2);
		
//		System.out.println(group2.searchByLastName("Gibson"));

	}

}
