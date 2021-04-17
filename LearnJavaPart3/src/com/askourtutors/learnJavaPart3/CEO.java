package com.askourtutors.learnJavaPart3;

public class CEO extends Employee {
	public CEO(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
	}
	@Override
	public int getSalary() {
		return super.getSalary() * 2;
	}
	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}
	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}

}
