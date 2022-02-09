package com.Ankita;

public class ClassObjectsPractice {
	public static void main(String[] args) {
		Person Alex = new Person();
		Alex.name = "Alex";
		Alex.age = 55;
		Alex.gender = "Male";
		Alex.sleep();

		Person Mia = new Person();
		Mia.name = "Mia";
		Mia.age = 40;
		Mia.gender = "Female";
		Mia.sleep();

		Person James = new Person();
		James.name = "James";
		James.age = 9;
		James.gender = "Male";
		James.sleep();
	}

}

class Person {
	String name;
	int age;
	String gender;

	void sleep() {
		if (age < 10) {
			System.out.println(name + " will sleep more than 12 hours in a day");
		} else if (age >= 10 && age <= 50) {
			System.out.println(name + " will sleep more than 10 hours in a day");

		} else {
			System.out.println(name + " will sleep average 10 hours in a day");
		}
	}
}
