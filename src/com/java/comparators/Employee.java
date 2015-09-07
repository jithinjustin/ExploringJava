package com.java.comparators;

public class Employee {
	private String name;
	private String jobTitle;
	private int age;
	private int salary;

	public Employee(String name, String jobTitle, int age, int salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.salary = salary;
	}

	// getters and setters

	public int getSalary() {
		return salary;

	}

	public String getJobTitle() {

		return jobTitle;
	}

	public int getAge() {
		return age;

	}

	public String toString() {
		return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
	}
}