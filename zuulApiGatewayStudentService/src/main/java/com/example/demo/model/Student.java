package com.example.demo.model;

public class Student {
	String name;
	String address;
	String grade;

	public Student(String name, String address, String grade) {
		super();
		this.name = name;
		this.address = address;
		this.grade = grade;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
