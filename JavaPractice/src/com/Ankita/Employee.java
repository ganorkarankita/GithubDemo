package com.Ankita;

class Employee {
	String emp_name;
	int emp_id;
	String address;

}

class Exercise {
	public static void main(String[] args) {
		System.out.println(printDetails());
	}

	public static String printDetails() {
		Employee e = new Employee();
		e.emp_name = "James";
		e.emp_id = 1001;
		e.address = "13th st, New York";
		return "Employee Name is" + e.emp_name + "Employee ID is" + e.emp_id + "Employee Address is" + e.address;

	}
}