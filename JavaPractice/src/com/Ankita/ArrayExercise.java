package com.Ankita;

public class ArrayExercise {
	public static void main(String[] args) {
		Person[] user = new Person[3];

		Person Alex = new Person();
		Alex.name = "Alex";
		Alex.age = 55;
		Alex.gender = "Male";

		Person Mia = new Person();
		Mia.name = "Mia";
		Mia.age = 40;
		Mia.gender = "Female";

		Person James = new Person();
		James.name = "James";
		James.age = 9;
		James.gender = "Male";

		user[0] = Alex;
		user[1] = Mia;
		user[1] = James;
		System.out.print(Alex.age);
	}
}
