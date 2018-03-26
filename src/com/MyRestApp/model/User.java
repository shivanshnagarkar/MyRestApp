package com.MyRestApp.model;


public class User {


	private long id;
	
	private String lastname;
	private String name;
	private String company;
	private int age;
	
	private double salary;

	public User(){
		id=0;
	}
	
	
	
	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public User(long id, String lastname, String name, String company, int age, double salary) {
		this.id = id;
		this.lastname = lastname;
		this.name = name;
		this.company = company;
		this.age = age;
		this.salary = salary;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", lastname=" + lastname + ", name=" + name + ", company=" + company + ", age=" + age
				+ ", salary=" + salary + "]";
	}



}
