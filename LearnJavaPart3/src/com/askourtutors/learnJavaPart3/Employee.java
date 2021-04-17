package com.askourtutors.learnJavaPart3;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;

	public String position;

	public static void main(String[] args) {
		Employee em1 = new Employee("Wink", "Dog", 100, "Front line");
		em1.hello();
	em1.checkPosition();
	System.out.println(em1.getSalary());
		// Array
		Employee[] employees = new Employee[3]; // 3 person
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("First Name :" + i, "Last Name :" + i, 1000 * i, "Position :" + i);
		}
		System.out.println(employees[0].firstname);
		System.out.println(employees[1].lastname);
		System.out.println(employees[2].salary);
		System.out.println(employees[1].salary);

	}

	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;

		position = positionInput;

	}

	public void hello() {
		System.out.println("Hello " + this.firstname);
	}

	public int getSalary() {
		return salary;
	}

	public void checkPosition() {
		System.out.println("Wink's position : " + this.position);
	}
}
