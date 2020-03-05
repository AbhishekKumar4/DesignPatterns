package com.abhishek.builder;

public class EmployeeBuilderTest {
	
	public static void main(String args[]) {
		Employee employee= new Employee.EmployeeBuilder(1, "Abhishek")
				.age(30).department("IT").state("UP").build();
		
		System.out.println("This is created object : " + employee);
	}

}
