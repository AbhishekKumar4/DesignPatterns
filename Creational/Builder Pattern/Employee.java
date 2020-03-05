package com.abhishek.builder;

public class Employee {

	private final int id;
	private final String name;
	private final int age;
	private final String department;
	private final String state;
	private final String country;

	private Employee(EmployeeBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.country = builder.country;
		this.department = builder.department;
		this.state = builder.state;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

    @Override
    public String toString() {
        return "Employee: "+this.id+", "+this.name+", "+this.age+", "+this.department+", "+this.state;
    }
    
	public static class EmployeeBuilder {
		private final int id;
		private final String name;
		private int age;
		private String department;
		private String state;
		private String country;

		public EmployeeBuilder(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder department(String department) {
			this.department = department;
			return this;
		}

		public EmployeeBuilder state(String state) {
			this.state = state;
			return this;
		}

		public EmployeeBuilder age(String country) {
			this.country = country;
			return this;
		}

		public Employee build() {
			Employee employee = new Employee(this);
			return employee;
		}
	}

}
