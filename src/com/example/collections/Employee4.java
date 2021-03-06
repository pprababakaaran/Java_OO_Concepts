package com.example.collections;

public class Employee4 implements Comparable<Employee4>{
	
	private Integer id;
	private String name;
	private Float salary;
	
	
	public Employee4(Integer id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee4 o) {
			if(id==o.id)  
			return 0;  
			else if(id>o.id)  
			return 1;  
			else  
			return -1;  
			
	}
}