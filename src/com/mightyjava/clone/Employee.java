package com.mightyjava.clone;

public class Employee implements Cloneable {
	private String name;
	private Department department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		emp.setDepartment((Department) emp.getDepartment().clone());
		return emp;
		//return super.clone();
	}

}
