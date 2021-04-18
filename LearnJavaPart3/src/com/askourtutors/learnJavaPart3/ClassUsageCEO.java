package com.askourtutors.learnJavaPart3;

public class ClassUsageCEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee dang = new Employee("Dang", "DumDee", 10000, "IT Manager");
		System.out.println(dang.getSalary());
		dang.hello();
		CEO ceo = new CEO("Somsri", "Srisuk", 100000, "Google CEO");
		System.out.println(ceo.getSalary());
		ceo.hello();
		ceo.fire(dang);
	}

}
