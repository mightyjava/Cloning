package com.mightyjava.clone;

public class TestCloning {
	public static void main(String[] args) {
		Department d1 = new Department();
		Employee e1 = new Employee(); 
		e1.setName("emp1");
		e1.setDepartment(d1);
		System.out.println(e1.hashCode()+","+e1.getName().hashCode()+","+e1.getDepartment().hashCode());
		try {
			Employee e2 = (Employee) e1.clone();
			e2.setName("emp2");
			System.out.println(e2.hashCode()+","+e2.getName().hashCode()+","+e2.getDepartment().hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
