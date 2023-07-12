package com.interview;

import java.util.*;
import java.util.stream.*;

public class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", 25));
		employees.add(new Employee("Alice", 32));
		employees.add(new Employee("Bob", 28));
		employees.add(new Employee("Mary", 36));

		List<Integer> ages = employees.stream().filter(e -> e.getAge() > 30).map(Employee::getAge)
				.collect(Collectors.toList());

		System.out.println("Ages greater than 30: " + ages);
	}
}
