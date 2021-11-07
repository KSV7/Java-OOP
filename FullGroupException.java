package com.gmail.kutepov89.sergey;

public class FullGroupException extends Exception {

	@Override
	public String getMessage() {
		return "Группа переполнена!";
	}

}